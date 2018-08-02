package day18;

public class MyBinaryTree {
    public static TreeNode root;
    private static Integer persistingData;
    private static Integer maxFound;
    private static MyBinaryTree tree;


    public static TreeNode findMaximumValue(MyBinaryTree tree) {
        maxFinder(tree.root);
        return tree.root;
    }

    /*
    I finished this whiteboard with the help of https://www.geeksforgeeks.org/find-maximum-or-minimum-in-binary-tree/ when I got stuck. My original code was similar to their solution in that we were both looking to see if current was bigger than .left or .right, but my logic was messed up. I also ran into nullPointers and kept trying to get around them so my data would be pure and not take in an outside number, but I couldn't avoid setting it to MIN-VALUE to make it work.
    */
    private static String maxFinder(TreeNode current) {

        //cannot set this to null or nullPointerExceptions happen everywhere
        if (current == null) {
            return Integer.MIN_VALUE + "";
        }

        Integer currentData = current.data;
        Integer leftData = Integer.valueOf(maxFinder(current.left));
        Integer rightData = Integer.valueOf(maxFinder(current.right));

        if (leftData > currentData)
            currentData = leftData;
        if (rightData > currentData)
            currentData = rightData;

        //Since returning tree.root in the public function, set the tree's root to the largest value.
        tree.root.data = currentData;
        return tree.root.data.toString();

    }
}
