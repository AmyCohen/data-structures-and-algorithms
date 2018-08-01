package day17;

public class Main {
    public static void main(String[] args) {
        BreadthFirstTraversal tree = new BreadthFirstTraversal();
        TreeNode n2 = new TreeNode(2);
        TreeNode n7 = new TreeNode(7);
        TreeNode n5 = new TreeNode(5);
        TreeNode n22 = new TreeNode(22);
        TreeNode n6 = new TreeNode(6);
        TreeNode n9 = new TreeNode(9);
        TreeNode n55 = new TreeNode(55);
        TreeNode n11 = new TreeNode(11);
        TreeNode n4 = new TreeNode(4);

        tree.root = n2;
        n2.left = n7;
        n2.right = n5;
        n7.left = n22;
        n7.right = n6;
        n5.right = n9;
        n6.left = n55;
        n6.right = n11;
        n9.left = n4;

        BreadthFirstTraversal.breadthFirstTraversal(tree);
        System.out.println(tree.toString());


    }
}
