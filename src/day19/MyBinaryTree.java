package day19;

public class MyBinaryTree {
    public TreeNode root;
    private TreeNode firstTreeNode;
    private TreeNode secondTreeNode;
    private int firstTreeData;
    private int secondTreeData;


    public boolean isIdentical(MyBinaryTree tree) {
        Boolean isTheSame = checkingTree(tree, firstTreeNode, secondTreeNode, firstTreeData, secondTreeData);
        return isTheSame;
    }

    private boolean checkingTree(MyBinaryTree tree, TreeNode firstTreeNode, TreeNode secondTreeNode, int firstTreeData, int secondTreeData) {
        Boolean isTrue = false;
        firstTreeNode = tree.root;
        secondTreeNode = this.root;

        checkingTree(tree, firstTreeNode.left, secondTreeNode.left, firstTreeData, secondTreeData);
        checkingTree(tree, firstTreeNode.right, secondTreeNode.right, firstTreeData, secondTreeData);

        if (firstTreeData == secondTreeData && firstTreeNode == secondTreeNode) {
            isTrue = true;
        }

        return isTrue;
    }
}
