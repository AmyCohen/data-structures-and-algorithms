package day17;

import jdk.nashorn.api.tree.Tree;

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
        Queue<TreeNode> qq = new LinkedList<>();
        qq.add(root);
        if (current == null) {
            return;
        }

        while(!qq.isEmpty()) {
        System.out.println("From top of while: " + qq.toString());
        current = qq.poll();
        System.out.println(current + " ");

        if (current.left != null) {
            qq.add(current.left);
        }
        if (current.right !=null) {
            qq.add(current.right);
        }

        }

//        qq.add(current.data);
//        breadthTraversalHelper(current.left);
//        breadthTraversalHelper(current.right);
//
//        System.out.println(qq.toString());

 ////////////////////
//    if(current.left != null && current.right != null){
//        qq.add(current.data);
//        breadthTraversalHelper(current.left);
//        breadthTraversalHelper(current.right);
//    } else if (current.left == null) {
//        qq.add(current.data);
//        breadthTraversalHelper(current.right);
//    } else if (current.right == null) {
//        qq.add(current.data);
//        breadthTraversalHelper(current.left);
//    }

        System.out.println("From long if conditional: " + qq.toString());





    }





}
