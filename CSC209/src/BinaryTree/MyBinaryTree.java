package BinaryTree;

public class MyBinaryTree {
    Node root;

    public MyBinaryTree() {
        this.root = null;
    }

    public void addToRight(String newName) {
        Node p = root;
        while (p.right != null){
            p = p.right;
        }
        p.right = new Node(newName);
    }

    public void addToLeft(String newName){
        Node p = root;
        while (p.left != null){
            p = p.left;
        }
        p.left = new Node(newName);
    }
}
