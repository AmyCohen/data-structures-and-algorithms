package day17;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstTraversal {
    public static TreeNode root;

    public static TreeNode getRoot() {
        return root;
    }

    public static BreadthFirstTraversal breadthFirstTraversal(BreadthFirstTraversal tree) {
        breadthTraversalHelper(tree.root);
        return tree;
    }

    private static void breadthTraversalHelper(TreeNode current){
        Queue<Integer> qq = new LinkedList<>();

        if (current == null) {
            return;
        }

//        qq.add(current.data);
//        breadthTraversalHelper(current.left);
//        breadthTraversalHelper(current.right);
//
//        System.out.println(qq.toString());

 ////////////////////
    if(current.left != null && current.right != null){
        qq.add(current.data);
        breadthTraversalHelper(current.left);
        breadthTraversalHelper(current.right);
    } else if (current.left == null) {
        qq.add(current.data);
        breadthTraversalHelper(current.right);
    } else if (current.right == null) {
        qq.add(current.data);
        breadthTraversalHelper(current.left);
    }

        System.out.println("From long if conditional: " + qq.toString());





    }





}

