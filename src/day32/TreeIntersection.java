package day32;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeIntersection {

    public static TreeNode root1;
    public static TreeNode root2;
//    public TreeNode current;

    public static int treeIntersection(TreeIntersection tree1, TreeIntersection tree2) {
//        List<TreeNode> matchingNumbers = new ArrayList<>();

        return treeIntersectionHelper(tree1.root1, tree2.root2).size();
//        return matchingNumbers;
    }

    private static List<TreeNode> treeIntersectionHelper(TreeNode current1, TreeNode current2){


        TreeNode leftValue;
        TreeNode rightValue;
//        TreeNode current;
        Queue<TreeNode> traversing = new LinkedList<>();
        Queue<TreeNode> firstTreeOutput = new LinkedList<>();
        Queue<TreeNode> secondTreeOutput = new LinkedList<>();

        List<TreeNode> matchingNumbers = new ArrayList<>();


        if (current1 == null || current2 == null) {
            return null;
        }

        traversing.add(root1);

        while(!traversing.isEmpty()) {
            current1 = traversing.poll();
            firstTreeOutput.add(current1);
            if (current1.left != null) {
                traversing.add(current1.left);
            }
            if (current1.right != null) {
                traversing.add(current1.right);
            }
        }
        System.out.println(firstTreeOutput.toString());

        traversing.add(root2);

        while(!traversing.isEmpty()) {
            current2 = traversing.poll();
            secondTreeOutput.add(current2);
            if (current2.left != null) {
                traversing.add(current2.left);
            }
            if (current2.right != null) {
                traversing.add(current2.right);
            }
        }

        System.out.println(secondTreeOutput.toString());

        for (TreeNode node : firstTreeOutput) {
            if (secondTreeOutput.contains(node)) {
                matchingNumbers.add(node);
            }
        }
        System.out.println(matchingNumbers.toString());

        return matchingNumbers;
    }
}
