package day20;


public class MyBinaryTree {
    public TreeNode root;

    public void flip() {
        flipHelper(this.root);
    }

    private static TreeNode flipHelper(TreeNode current) {
        //hold the value of the right node before changing it so it can be applied correctly to the left at the end
        TreeNode newLeft = current.right;
        current.right = current.left;
        current.left = newLeft;

        //I was trying to combine these two "ifs" on my original logic and that is what was messing me up.
        if (current.left != null) {
            flipHelper(current.left);
        }

        if (current.right != null) {
            flipHelper(current.right);
        }

        return current;
    }
}

/*
    I don't understand why my original logic didn't work but I'll keep studying it.  I followed this example for how to solve it.
    https://stackoverflow.com/questions/9460255/reverse-a-binary-tree-left-to-right
 */