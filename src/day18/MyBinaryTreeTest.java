package day18;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyBinaryTreeTest {

    @Test
    void findingMax() {
        MyBinaryTree tree = new MyBinaryTree();
        TreeNode n2 = new TreeNode(2);
        TreeNode n7 = new TreeNode(7);
        TreeNode n5 = new TreeNode(5);
        TreeNode num2 = new TreeNode(2);
        TreeNode n6 = new TreeNode(6);
        TreeNode n9 = new TreeNode(9);
        TreeNode num5 = new TreeNode(5);
        TreeNode n11 = new TreeNode(11);
        TreeNode n4 = new TreeNode(4);

        tree.root = n2;
        n2.left = n7;
        n2.right = n5;
        n7.left = num2;
        n7.right = n6;
        n5.right = n9;
        n6.left = num5;
        n6.right = n11;
        n9.left = n4;

        MyBinaryTree.findMaximumValue(tree);
        String actual = MyBinaryTree.findMaximumValue(tree).toString();
        String expected = n11.toString();

        assertEquals(expected, actual);
    }

    @Test
    void findingABiggerMax() {
        MyBinaryTree tree = new MyBinaryTree();
        TreeNode n2 = new TreeNode(2);
        TreeNode n7 = new TreeNode(7);
        TreeNode n5 = new TreeNode(5);
        TreeNode num2 = new TreeNode(2);
        TreeNode n6 = new TreeNode(6);
        TreeNode n9 = new TreeNode(9);
        TreeNode num5 = new TreeNode(5);
        TreeNode n11 = new TreeNode(11);
        TreeNode n4 = new TreeNode(4);
        TreeNode n99 = new TreeNode(99);

        tree.root = n2;
        n2.left = n7;
        n2.right = n5;
        n7.left = num2;
        n7.right = n6;
        n5.right = n9;
        n6.left = num5;
        n6.right = n11;
        n9.left = n4;
        num5.right = n99;

        MyBinaryTree.findMaximumValue(tree);
        String actual = MyBinaryTree.findMaximumValue(tree).toString();
        String expected = n99.toString();

        assertEquals(expected, actual);
    }

    @Test
    void findingNothing() {
        MyBinaryTree tree = new MyBinaryTree();

        MyBinaryTree.findMaximumValue(tree);
        TreeNode actual = MyBinaryTree.findMaximumValue(tree);
        TreeNode expected = null;

        assertEquals(expected, actual);
    }

}
