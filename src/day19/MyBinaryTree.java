package day19;

public class MyBinaryTree {
    public TreeNode root;

    public boolean isIdentical(MyBinaryTree scuba) {
        return this.checkingTree(this.root, scuba.root);
    }

    private boolean checkingTree(TreeNode firstTreeNode, TreeNode secondTreeNode) {
        System.out.println(firstTreeNode.data);
        System.out.println(secondTreeNode.data);
        boolean leftside = checkingTree(firstTreeNode.left, secondTreeNode.left);
        boolean rightside = checkingTree(firstTreeNode.right, secondTreeNode.right);

        if (firstTreeNode == null && secondTreeNode == null) {
            return true;
        }
        if (firstTreeNode == null && secondTreeNode != null) {
            return false;
        }
        if (firstTreeNode.data != secondTreeNode.data) {
            return false;
        }

        return leftside && rightside;

    }
}
