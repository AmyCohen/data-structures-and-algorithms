package day19;

public class Main {
    public static void main(String[] args) {
        MyBinaryTree tree1 = new MyBinaryTree();
        TreeNode n5 = new TreeNode(5);
        TreeNode n2 = new TreeNode(2);
        TreeNode n14 = new TreeNode(14);

        tree1.root = n5;
        n5.left = n2;
        n5.right = n14;

        MyBinaryTree tree2 = new MyBinaryTree();
        TreeNode num5 = new TreeNode(5);
        TreeNode num2 = new TreeNode(2);
        TreeNode num12 = new TreeNode(12);

        tree1.root = num5;
        num5.left = num2;
        num5.right = num12;

        tree1.isIdentical(tree2);
        tree1.toString();
        tree2.toString();

    }

}
