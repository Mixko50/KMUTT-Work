package BinarySerachTreeLab;

import BinaryTree.Node;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
    BSTNode root;

    public BinarySearchTree() {
        root = null;
    }

    public BinarySearchTree(BSTNode root) {
        this.root = null;
    }

    public BSTNode search(int value) {
       BSTNode p =root;
       int i = 0;
       while (p != null){
           if (p.info == value){
               System.out.println(i + " Steps to find the "+ value);
               return p;
           } else if (value < p.info){
               p = p.left;
           } else {
               p = p.right;
           }
           i++;
       }
        System.out.println("Not found the "+value);
       return null;
    }
    public void insert(int newInfo) {
        BSTNode p = new BSTNode(newInfo);
        if (root == null) {
            root = p;
        } else {
            BSTNode n = root;
            while ((n.left != null && newInfo < n.info) || (n.right != null && newInfo > n.info)) {
                if (newInfo < n.info) {
                    n = n.left;
                } else {
                    n = n.right;
                }
            }
            if (newInfo < n.info) {
                n.left = p;
            } else {
                n.right = p;
            }
        }
    }

    public void preorderTraversal(BSTNode p){
        if (p != null){
            System.out.print(p.info+ " ");
            preorderTraversal(p.left);
            preorderTraversal(p.right);
        }
    }
    public void inorderTraversal(BSTNode p){
        if (p != null){
            inorderTraversal(p.left);
            System.out.print(p.info+ " ");
            inorderTraversal(p.right);
        }
    }

    public void postorderTraversal(BSTNode p){
        if (p != null){
            postorderTraversal(p.left);
            postorderTraversal(p.right);
            System.out.print(p.info+ " ");
        }
    }

    public void breadthFirstTraversal( ){
        BSTNode p = root;
        Queue<BSTNode> q = new LinkedList<>();
        if (p != null){
            q.add(p);
            while (!q.isEmpty()){
                p = q.remove(); //dequeue
                System.out.print(p.info+ " ");
                if (p.left != null ) q.add(p.left); //enqueue
                if (p.right != null) q.add(p.right); //enqueue
            }
        }
        System.out.println("");
    }

    public void deleteByMerging(int deletedValue){
        //merge the right subtree of the deleted node to be under (right child) of left subtree of deleted node
        BSTNode p = root;
        BSTNode prev = null;
        while (p != null && p.info != deletedValue){
            prev = p;
            if (deletedValue < p.info){
                p = p.left;
            } else {
                p = p.right;
            }
        }
        BSTNode parentDeletedNode = prev;
        BSTNode deletedNode = p;
        BSTNode parentToPointTo = null;
        if (p != null && p.info == deletedValue){

            if (deletedNode.right == null){ //has single left child
                parentToPointTo = deletedNode.left;
            } else if (deletedNode.left == null){ //has single right child
                parentToPointTo = deletedNode.right;
            } else {
                BSTNode rightMost = deletedNode.left;
                while (rightMost.right != null) {
                    rightMost = rightMost.right;
                }
                rightMost.right = deletedNode.right;
                parentToPointTo = deletedNode.left;
            }
            //search for rightmost node of the left subtree
            if (deletedNode == root){
                root = parentToPointTo;
            } else if (deletedNode == parentDeletedNode.left){
                parentDeletedNode.left = parentToPointTo;
            } else {
                parentDeletedNode.right = parentToPointTo;
            }
        }
    }

}
