package BinaryTree;

public class BinaryTree {
    public static void main(String[] args) {
        MyBinaryTree tree1 = new MyBinaryTree();
        tree1.root = new Node("John");
        tree1.root.left = new Node("Kenny");
        tree1.root.right = new Node("Robert");
        Node x = new Node("Mr. X");
        tree1.root.right.right = x;
        System.out.println(tree1.root.name);
        System.out.println(tree1.root.left.name);
        System.out.println(tree1.root.right.right.name);
        tree1.root.right.right.left = new Node("Ann");

        tree1.addToRight("Tony");
        System.out.println(tree1.root.right.right.right.name);

        tree1.addToLeft("Jessy");
        tree1.addToLeft("Lora");
        tree1.addToLeft("Sindy");
        System.out.println(tree1.root.left.left.name);
        System.out.println(tree1.root.left.left.left.left.name);

    }
}