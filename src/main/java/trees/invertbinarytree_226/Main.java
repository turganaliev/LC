package trees.invertbinarytree_226;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        TreeNode root = new TreeNode(4,
                new TreeNode(2, new TreeNode(1), new TreeNode(3)),
                new TreeNode(7, new TreeNode(6), new TreeNode(9))
        );

        print(root);
        System.out.println();
        print(solution.invertTree(root));
    }

    static void print(TreeNode node) {
        if (node == null) return;
        print(node.left);
        System.out.print(node.val + " ");
        print(node.right);
    }
}