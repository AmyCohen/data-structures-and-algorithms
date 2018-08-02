package day18;

public class MyBinaryTree {
    public static TreeNode root;

    public static Integer findMaximumValue(MyBinaryTree tree) {
        return (maxFinder(root));
    }

    private static Integer maxFinder(TreeNode current) {
//        Integer maxLeft;
//        Integer maxRight;
        Integer maxFound;

//        if(current == null) {
//            return null;
//        }
//        if (current.left != null) {
//            maxLeft = maxFinder(current.left);
//        }
//        if (current.right != null) {
//            maxRight = maxFinder(current.right);
//        }
        maxFound = Math.max(maxFinder(current.left), maxFinder(current.right));
//        while (current != null) {
//            maxFound = Math.max(maxFinder(current.left), maxFinder(current.right));
//        }
        System.out.println(maxFound.toString());

        return maxFound;
    }
}
