package day20;


public class MyBinaryTree {
    public TreeNode root;

    public TreeNode flip() {
        return flipHelper(this.root);
    }

    private static TreeNode flipHelper(TreeNode current) {

        //if current and the left/right are null, the tree is empty
        if (current == null && current.left == null && current.right == null) {
            return null;
        }

        //separate from above since a node could be null that the recursion is looking at without the rest of the tree being null
        if (current == null || (current.left == null && current.right == null)) {
            return null;
        }

        if (current.left == null){
            current.left = current.right;
            current.right = null;
        } else if (current.right == null) {
            current.right = current.left;
            current.left = null;
        }

        if (current.left !=null && current.right !=null) {
        TreeNode newLeft = current.right;
            //hold on to a reference to the right node

            //change the right node to be what the left node is
            current.right = current.left;

            //use the value stored to replace the value on the left
            current.left = newLeft;
        }

        flipHelper(current.left);
        flipHelper(current.right);



        return current;
    }
}
