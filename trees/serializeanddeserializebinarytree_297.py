class TreeNode(object):
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None

class Codec:

    def serialize(self, root):
        res = []

        def dfs(node):
            if not node:
                res.append('x')
                return
            res.append(str(node.val))
            dfs(node.left)
            dfs(node.right)

        dfs(root)
        return ' '.join(res)

    def deserialize(self, data):
        def dfs(nodes):
            val = next(nodes)
            if val == 'x':
                return None
            cur = TreeNode(int(val))
            cur.left = dfs(nodes)
            cur.right = dfs(nodes)
            return cur

        return dfs(iter(data.split()))

if __name__ == "__main__":
    def build_tree(nodes):
        val = next(nodes)
        if not val or val == "x":
            return None
        cur = TreeNode(val)
        cur.left = build_tree(nodes)
        cur.right = build_tree(nodes)
        return cur

    def print_tree(root):
        if not root:
            yield "x"
            return
        yield str(root.val)
        yield from print_tree(root.left)
        yield from print_tree(root.right)

    root = build_tree(iter(input().split()))
    solution = Codec()
    new_root = solution.deserialize(solution.serialize(root))
    print(" ".join(print_tree(new_root)))