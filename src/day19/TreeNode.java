package day19;

public class TreeNode {
    public int data;
    public TreeNode left;
    public TreeNode right;

    public TreeNode (int value) {
        this.data = value;
    }

    public String toString () {
        return String.valueOf(this.data);
    }

}
