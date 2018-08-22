package day32;

import org.junit.jupiter.api.Test;

import java.util.List;

import static day32.TreeIntersection.treeIntersection;
import static org.junit.jupiter.api.Assertions.*;

class TreeIntersectionTest {

    @Test
    void treeIntersection3Match() {
        TreeIntersection tree1 = new TreeIntersection();
        TreeNode n5 = new TreeNode(5);
        TreeNode n7 = new TreeNode(7);
        TreeNode n2 = new TreeNode(2);
        TreeNode n8 = new TreeNode(8);
        TreeNode n12 = new TreeNode(12);
        TreeNode n1 = new TreeNode(1);
        TreeNode n10 = new TreeNode(10);
        TreeNode n6= new TreeNode(6);

        tree1.root1 = n5;
        n5.left = n7;
        n5.right = n2;
        n7.left = n8;
        n7.right = n12;
        n2.right = n1;
        n1.left  = n10;
        n1.right = n6;

        TreeIntersection tree2 = new TreeIntersection();
        TreeNode num10 = new TreeNode(10);
        TreeNode num1 = new TreeNode(1);
        TreeNode num88 = new TreeNode(88);
        TreeNode num21 = new TreeNode(21);
        TreeNode num12 = new TreeNode(12);
        TreeNode num13 = new TreeNode(13);

        tree2.root2 = num10;
        num10.left = num1;
        num10.right = num88;
        num1.right = num21;
        num88.left  = num12;
        num88.right = num13;


        String actual = treeIntersection(tree1, tree2).toString();
        String expected = "[12, 1, 10]";

        assertEquals(expected, actual);
    }

    @Test
    void treeIntersection0Match() {
        TreeIntersection tree1 = new TreeIntersection();
        TreeNode n5 = new TreeNode(5);
        TreeNode n7 = new TreeNode(7);
        TreeNode n2 = new TreeNode(2);
        TreeNode n8 = new TreeNode(8);
        TreeNode n15 = new TreeNode(15);
        TreeNode n3 = new TreeNode(3);
        TreeNode n14 = new TreeNode(14);
        TreeNode n6= new TreeNode(6);

        tree1.root1 = n5;
        n5.left = n7;
        n5.right = n2;
        n7.left = n8;
        n7.right = n15;
        n2.right = n3;
        n3.left  = n14;
        n3.right = n6;

        TreeIntersection tree2 = new TreeIntersection();
        TreeNode num10 = new TreeNode(10);
        TreeNode num1 = new TreeNode(1);
        TreeNode num88 = new TreeNode(88);
        TreeNode num21 = new TreeNode(21);
        TreeNode num12 = new TreeNode(12);
        TreeNode num13 = new TreeNode(13);

        tree2.root2 = num10;
        num10.left = num1;
        num10.right = num88;
        num1.right = num21;
        num88.left  = num12;
        num88.right = num13;


        String actual = treeIntersection(tree1, tree2).toString();
        String expected = "[]";

        assertEquals(expected, actual);
    }

    @Test
    void treeIntersection1EmptyTree() {
        TreeIntersection tree1 = new TreeIntersection();

        TreeIntersection tree2 = new TreeIntersection();
        TreeNode num10 = new TreeNode(10);
        TreeNode num1 = new TreeNode(1);
        TreeNode num88 = new TreeNode(88);
        TreeNode num21 = new TreeNode(21);
        TreeNode num12 = new TreeNode(12);
        TreeNode num13 = new TreeNode(13);

        tree2.root2 = num10;
        num10.left = num1;
        num10.right = num88;
        num1.right = num21;
        num88.left  = num12;
        num88.right = num13;


        List<Integer> actual = treeIntersection(tree1, tree2);
        List<Integer> expected = null;

        assertEquals(expected, actual);
    }

    @Test
    void treeIntersection2EmptyTrees() {
        TreeIntersection tree1 = new TreeIntersection();
        TreeIntersection tree2 = new TreeIntersection();

        List<Integer> actual = treeIntersection(tree1, tree2);
        List<Integer> expected = null;

        assertEquals(expected, actual);
    }

}