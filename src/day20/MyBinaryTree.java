package day20;

import jdk.nashorn.api.tree.Tree;

public class MyBinaryTree {
    public TreeNode root;

    public TreeNode flip() {
        return flipHelper(this.root);
    }

    private static TreeNode flipHelper(TreeNode current) {
        //if the current is null there is nothing to flip
        if (current == null) {
            return current;
        }

        //hold on to a reference to the right node
        TreeNode newLeft = flipHelper(current.right);

        //change the right node to be what the left node is
        current.right = current.left;

        //use the value stored to replace the value on the left
        current.left = newLeft;

        return current;
    }
}
