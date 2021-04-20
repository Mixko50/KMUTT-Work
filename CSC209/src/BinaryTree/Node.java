package BinaryTree;

public class Node {
    String name;
    Node left;
    Node right;

    public Node(String name, Node left, Node right) {
        this.name = name;
        this.left = left;
        this.right = right;
    }

    public Node(String name) {
        this.name = name;
    }
}
