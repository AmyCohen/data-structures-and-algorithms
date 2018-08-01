package day16;

public class FizzBuzzTree {

    public static TreeNode root;
    public static TreeNode current;

    public TreeNode getRoot(){
        return root;
    }


    public static void fizzBuzzFinder(TreeNode current) {
        if (current == null) {
            return;
        }

        if (Integer.parseInt(current.data) % 15 == 0) {
            current.data = "FizzBuzz";
        } else if (Integer.parseInt(current.data) % 5 == 0) {
            current.data = "Buzz";
        } else if (Integer.parseInt(current.data) % 3 == 0) {
            current.data = "Fizz";
        }
        fizzBuzzFinder(current.left);
        fizzBuzzFinder(current.right);

    }

    public static FizzBuzzTree fizzBuzz(FizzBuzzTree tree) {
        fizzBuzzFinder(tree.root);
        return tree;
    }


    public void add(String value) {
        if (this.root == null) {
            this.root = new TreeNode(value);
            return;
        }
        this.add(value, this.root);
    }
    // moving through the tree until we find a free
    // spot to place the new value.
    private void add(String value, TreeNode current) {
        // found a proper spot on the left!
        if (current.left == null && Integer.parseInt(value) <= Integer.parseInt(current.data)) {
            current.left = new TreeNode(value);
            return;
        }

        // found a proper spot on the right!
        if (current.right == null && Integer.parseInt(value) > Integer.parseInt(current.data)) {
            current.right = new TreeNode(value);
            return;
        }

        // recursive case: move through the tree
        // move left and right through the tree comparing values.
        if (Integer.parseInt(value) <= Integer.parseInt(current.data))  {
            add(value, current.left);
        } else if (Integer.parseInt(value) > Integer.parseInt(current.data)) {
            add(value, current.right);
        }
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        return inOrder(builder, this.root).toString();
    }

    private StringBuilder preOrder(StringBuilder builder, TreeNode current) {
        if (current == null) {
            return builder;
        }

        builder.append(current.data + " ");
        preOrder(builder, current.left);
        preOrder(builder, current.right);

        return builder;
    }

    private StringBuilder inOrder(StringBuilder builder, TreeNode current) {
        if (current == null) {
            return builder;
        }

        inOrder(builder, current.left);
        builder.append(current.data + " ");
        inOrder(builder, current.right);

        return builder;
    }
}
