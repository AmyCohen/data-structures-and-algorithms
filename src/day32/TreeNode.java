package day32;

public class TreeNode {
    public TreeNode left;
    public TreeNode right;
//    public TreeNode current;
    public int data;


    public TreeNode(int value) {
        this.data = value;
    }
    public String toString() {
        return ""+this.data;
    }

}
