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

    private static String maxFinder(TreeNode current) {

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
        tree.root.data = currentData;
        return tree.root.data.toString();

//        if (persistingData == null || persistingData < currentData) {
//            persistingData = currentData;
//        }
//        if (persistingData > currentData) {
//            maxFound = persistingData;
//        }

//        persistingData = currentData;

//        if (current == null) {
//            return null;
//        }

//        while (currentData < maxFound) {
//            if (current.data > current.left.data) {
//            } else if (current.data > current.right.data) {
//                currentData = current.data;
//            } else if (current.data < current.left.data) {
//                currentData = current.left.data;
//            } else if (current.data < current.right.data) {
//                currentData = current.right.data;
//            }
//        }

//        Math.max(maxFinder(current.left), maxFinder(current.right));
//        Math.max(maxFinder(current.left), maxFinder(current.right));

//            maxFinder(current.left);
//            maxFinder(current.right);
//        return maxFound;
    }
}
