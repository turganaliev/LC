from typing import Optional

class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right
class Solution:
    def isSubtree(self, root: Optional[TreeNode], subRoot: Optional[TreeNode]) -> bool:
        def is_same_tree(tree1, tree2):
            if tree1 is None and tree2 is None:
                return True
            if tree1 is None or tree2 is None:
                return False

            return (tree1.val == tree2.val and is_same_tree(tree1.left, tree2.left) and is_same_tree(tree1.right,
                                                                                                     tree2.right))

        if not root:
            return False
        return is_same_tree(root, subRoot) or self.isSubtree(root.left, subRoot) or self.isSubtree(root.right, subRoot)

def build_tree(nodes, f):
    val = next(nodes)
    if val == "x":
        return None
    left = build_tree(nodes, f)
    right = build_tree(nodes, f)
    return TreeNode(f(val), left, right)

if __name__ == "__main__":
    root = build_tree(iter(input().split()), int)
    sub_root = build_tree(iter(input().split()), int)
    solution = Solution()
    res = solution.isSubtree(root, sub_root)
    print("true" if res else "false")