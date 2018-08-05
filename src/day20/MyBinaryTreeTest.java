package day20;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyBinaryTreeTest {

    @Test
    void flip() {
        MyBinaryTree lycra = new MyBinaryTree();
        TreeNode n8 = new TreeNode(8);
        TreeNode n2 = new TreeNode(2);
        TreeNode n6 = new TreeNode(6);
        TreeNode n7 = new TreeNode(7);
        TreeNode n1 = new TreeNode(1);

        lycra.root = n8;
        n8.left= n2;
        n8.right = n6;
        n6.left = n7;
        n7.right = n1;

        lycra.flip();

        boolean leftEquals6 = lycra.root.left.data == 6;
        boolean rightEquals2 = lycra.root.right.data == 2;
        boolean leftEqualsNull = lycra.root.left.left == null;
        boolean bottomNodeEquals1 = lycra.root.left.right.left.data == 1;

        assertTrue(leftEquals6);
        assertTrue(rightEquals2);
        assertTrue(leftEqualsNull);
        assertTrue(bottomNodeEquals1);
    }

    @Test
    void flippedAgain() {
        MyBinaryTree lycra = new MyBinaryTree();
        TreeNode n8 = new TreeNode(8);
        TreeNode n2 = new TreeNode(2);
        TreeNode n6 = new TreeNode(6);
        TreeNode n7 = new TreeNode(7);
        TreeNode n1 = new TreeNode(1);
        TreeNode n5 = new TreeNode(5);

        lycra.root = n8;
        n8.left= n2;
        n8.right = n6;
        n6.left = n7;
        n7.right = n1;
        n7.left = n5;

        lycra.flip();

        boolean leftEquals6 = lycra.root.left.data == 6;
        boolean rightEquals2 = lycra.root.right.data == 2;
        boolean leftEqualsNull = lycra.root.left.left == null;
        boolean bottomLeftEquals1 = lycra.root.left.right.left.data == 1;
        boolean bottomRightEquals5 = lycra.root.left.right.right.data == 5;

        assertTrue(leftEquals6);
        assertTrue(rightEquals2);
        assertTrue(leftEqualsNull);
        assertTrue(bottomLeftEquals1);
        assertTrue(bottomRightEquals5);
    }

    @Test
    void flippedNothing() {
        MyBinaryTree lycra = new MyBinaryTree();
        boolean equalsNull = lycra.root == null;
        assertTrue(equalsNull);
    }
}