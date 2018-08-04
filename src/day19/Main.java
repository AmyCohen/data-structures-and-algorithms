package day19;

public class Main {
    public static void main(String[] args) {
        MyBinaryTree scuba = new MyBinaryTree();
        TreeNode num99 = new TreeNode(77);
        TreeNode num2 = new TreeNode(2);
        TreeNode num12 = new TreeNode(12);

        scuba.root = num99;
        num99.left = num2;
        num99.right = num12;
        System.out.println("scuba = " + scuba.root.data);

        MyBinaryTree liverpool = new MyBinaryTree();
        TreeNode n5 = new TreeNode(5);
        TreeNode n2 = new TreeNode(2);
        TreeNode n14 = new TreeNode(14);

        liverpool.root = n5;
        n5.left = n2;
        n5.right = n14;
        System.out.println("liverpool = " + liverpool.root.data);


        liverpool.isIdentical(scuba);

    }

}
