package day19;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyBinaryTreeTest {

    @Test
    void isIdenticalFalse() {

        MyBinaryTree scuba = new MyBinaryTree();
        TreeNode num99 = new TreeNode(99);
        TreeNode num2 = new TreeNode(2);
        TreeNode num12 = new TreeNode(12);

        scuba.root = num99;
        num99.left = num2;
        num99.right = num12;

        MyBinaryTree liverpool = new MyBinaryTree();
        TreeNode n5 = new TreeNode(5);
        TreeNode n2 = new TreeNode(2);
        TreeNode n14 = new TreeNode(14);

        liverpool.root = n5;
        n5.left = n2;
        n5.right = n14;

        boolean actual = liverpool.isIdentical(scuba);
        boolean expected = false;

        assertEquals(expected,actual);
    }

    @Test
    void isIdenticalTrue() {

        MyBinaryTree scuba = new MyBinaryTree();
        TreeNode num99 = new TreeNode(99);
        TreeNode num2 = new TreeNode(2);
        TreeNode num12 = new TreeNode(12);

        scuba.root = num99;
        num99.left = num2;
        num99.right = num12;

        MyBinaryTree liverpool = new MyBinaryTree();
        TreeNode n99 = new TreeNode(99);
        TreeNode n2 = new TreeNode(2);
        TreeNode n12 = new TreeNode(12);

        liverpool.root = n99;
        n99.left = n2;
        n99.right = n12;

        boolean actual = liverpool.isIdentical(scuba);
        boolean expected = true;

        assertEquals(expected,actual);
    }

    @Test
    void emptyEqualsTrue() {

        MyBinaryTree scuba = new MyBinaryTree();
        MyBinaryTree liverpool = new MyBinaryTree();

        boolean actual = liverpool.isIdentical(scuba);
        boolean expected = true;

        assertEquals(expected,actual);
    }



}