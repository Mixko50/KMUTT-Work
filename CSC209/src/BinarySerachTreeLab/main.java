package BinarySerachTreeLab;

public class main {
    public static void main(String[] args) {
        BinarySearchTree b1 = new BinarySearchTree();
        b1.insert(50);
        b1.insert(40);
        b1.insert(30);


//        System.out.println(b1.root.left.info);
//        System.out.println(b1.root.left.left.info);
        b1.insert(45); b1.insert(100);
        b1.insert(80); b1.insert(300);
//        System.out.println(b1.root.left.left.right.info);

        b1.insert(150);
        b1.insert(48);
//        System.out.println(b1.root.left.right.info);

//        b1.search(19);
//        b1.search(99);

        System.out.println("preorder traversal");
        b1.preorderTraversal(b1.root);
        System.out.println("\n"+"inorder traversal");
        b1.inorderTraversal(b1.root);
        System.out.println("\n"+"postorder traversal");
        b1.postorderTraversal(b1.root);
        System.out.println("\n"+"Breadth first traversal");
        b1.breadthFirstTraversal();
        b1.insert(70);
        b1.insert(90); b1.insert(60);
        b1.insert(75); b1.insert(85);
        b1.insert(95);
        b1.insert(5000);

        System.out.println("========================");
        System.out.println("\n"+"inorder traversal");
        b1.inorderTraversal(b1.root);
        b1.deleteByMerging(5000);
        System.out.println("\ninorder traversal");
        b1.inorderTraversal(b1.root);
        System.out.println("\n"+"-------deletedByMerging Success-------");

    }
}
