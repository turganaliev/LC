from typing import Optional


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

class Solution:
    def maxDepth(self, root: Optional[TreeNode]) -> int:
        if root is None:
            return 0
        return max(self.maxDepth(root.left), self.maxDepth(root.right)) + 1

def build_tree(nodes, f):
    val = next(nodes)
    if val == "x":
        return None
    left = build_tree(nodes, f)
    right = build_tree(nodes, f)
    return TreeNode(f(val), left, right)


if __name__ == "__main__":
    solver = Solution()
    #     3
    #    / \
    #   9   20
    #      /  \
    #     15   7
    # You would type this into the console: 3 9 x x 20 15 x x 7 x x
    print("Enter tree nodes in pre-order (use 'x' for null):")

    root = build_tree(iter(input().split()), int)

    res = solver.maxDepth(root)
    print(f"The maximum depth of the tree is: {res}")
