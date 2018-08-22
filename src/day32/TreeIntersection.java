package day32;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeIntersection {

    public TreeNode root;
    public TreeNode current;

    public static List<TreeNode> treeIntersection(TreeIntersection tree1, TreeIntersection tree2) {

        TreeNode leftValue;
        TreeNode rightValue;
//        TreeNode current;
        Queue<TreeNode> firstTreeOutput = new LinkedList<>();
        List<TreeNode> matchingNumbers = new ArrayList<>();

        if (tree1.root == null || tree2.root == null) {
            return null;
        }

        firstTreeOutput.add(tree1.root);
        
        firstTreeOutput.add(tree1.root.left);
        firstTreeOutput.add(tree1.root.right);

        leftValue = tree2.root.left;
        rightValue = tree2.root.right;

        while (!firstTreeOutput.isEmpty()) {
            if (firstTreeOutput.contains(leftValue)){
                matchingNumbers.add(leftValue);
            }
            if (firstTreeOutput.contains(rightValue)){
                matchingNumbers.add(rightValue);
            }
        }

        return matchingNumbers;
    }
}
