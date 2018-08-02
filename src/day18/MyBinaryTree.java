package day18;

public class MyBinaryTree {
    public static TreeNode root;
    private static Integer persistingData;
    private static Integer maxFound;


    public static MyBinaryTree findMaximumValue(MyBinaryTree tree) {
        maxFinder(tree.root);
        return tree;
    }

    private static Integer maxFinder(TreeNode current) {
        Integer currentData = current.data;

//        if (persistingData == null) {
//            return null;
//        }

        if (persistingData == null || persistingData < currentData) {
            persistingData = currentData;
        }
        if (persistingData > currentData) {
            maxFound = persistingData;
        }

//        persistingData = currentData;

        if (current == null) {
            return null;
        }

        while (currentData < maxFound) {
            if (current.data > current.left.data) {
            } else if (current.data > current.right.data) {
                currentData = current.data;
            } else if (current.data < current.left.data) {
                currentData = current.left.data;
            } else if (current.data < current.right.data) {
                currentData = current.right.data;
            }
        }
            maxFinder(current.left);
            maxFinder(current.right);
        return maxFound;
    }
}
