package day19;

public class MyBinaryTree {
    public TreeNode root;

    public boolean isIdentical(MyBinaryTree scuba) {
        return this.checkingTree(this.root, scuba.root);
    }

    private boolean checkingTree(TreeNode firstTreeNode, TreeNode secondTreeNode) {

        if (firstTreeNode == null && secondTreeNode == null) {
            return true;
        }
        if (firstTreeNode == null && secondTreeNode != null) {
            return false;
        }
        if (firstTreeNode.data != secondTreeNode.data) {
            return false;
        }

        boolean leftside = checkingTree(firstTreeNode.left, secondTreeNode.left);
        boolean rightside = checkingTree(firstTreeNode.right, secondTreeNode.right);

        return leftside && rightside;

    }
}
