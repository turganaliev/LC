class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None

class Solution:
    def lowestCommonAncestor(self, root: 'TreeNode', p: 'TreeNode', q: 'TreeNode') -> 'TreeNode':
        if p.val > root.val and q.val > root.val:
            return self.lowestCommonAncestor(root.right, p, q)
        elif p.val < root.val and q.val < root.val:
            return self.lowestCommonAncestor(root.left, p, q)
        else:
            return root.val


def build_tree(nodes):
    val = next(nodes)
    if val == "x":
        return None

    node = TreeNode(int(val))
    node.left = build_tree(nodes)
    node.right = build_tree(nodes)
    return node

if __name__ == "__main__":
    bst = build_tree(iter(input().split()))
    p = int(input())
    q = int(input())
    p_node = TreeNode(p)
    q_node = TreeNode(q)
    solution = Solution()
    res = solution.lowestCommonAncestor(bst, p_node, q_node)
    print(res)