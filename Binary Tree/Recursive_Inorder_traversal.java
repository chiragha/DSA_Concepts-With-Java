package dsa_with.java.Binarytree;

public class Recursive_Inorder_traversal {
      int data;
    Recursive_Inorder_traversal left, right;

    public Recursive_Inorder_traversal(int item) {
        data = item;
        left = right = null;
    }
}

class inOrder {

    
    static void inorderTraversal(Node node) {
        if (node == null) // Base case
            return;
      
        inorderTraversal(node.left);
        System.out.print(node.data + " ");
        inorderTraversal(node.right);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        inorderTraversal(root);
    }
}