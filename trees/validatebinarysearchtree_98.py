from math import inf
from typing import Optional


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

class Solution:
    def isValidBST(self, root: Optional[TreeNode]) -> bool:
        def dfs(root, minVal, maxVal):
            if not root:
                return True
            if not (minVal < root.val < maxVal):
                return False

            return dfs(root.left, minVal, root.val) and dfs(root.right, root.val, maxVal)

        return dfs(root, -inf, inf)

def build_tree(nodes, f):
    val = next(nodes)
    if val == "x":
        return None
    left = build_tree(nodes, f)
    right = build_tree(nodes, f)
    return TreeNode(f(val), left, right)

if __name__ == "__main__":
    root = build_tree(iter(input().split()), int)
    solution = Solution()
    res = solution.isValidBST(root)
    print("true" if res else "false")