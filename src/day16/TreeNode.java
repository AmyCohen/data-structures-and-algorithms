package day16;

public class TreeNode {
    public TreeNode left;
    public TreeNode right;
    public String data;


    public TreeNode (String value) {
        this.data = value;
    }
    public String toString() {
        return "" + this.data;
    }

}
