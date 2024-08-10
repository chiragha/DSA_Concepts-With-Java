
package dsa_with.java.Binarytree;
import java.util.Stack;

class Node {

    int data;
    Node left, right;
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}

class BinaryTree {

    Node root;

    void iterativePreorder()
    {
        iterativePreorder(root);
    }

    void iterativePreorder(Node node)
    {
        if (node == null) {  // if node is null
            return;
        }

        Stack<Node> nodeStack = new Stack<Node>();
        nodeStack.push(root);

        while (nodeStack.empty() == false) {  // if there is element in node

            Node mynode = nodeStack.peek();
            System.out.print(mynode.data + " ");
            nodeStack.pop();

            if (mynode.right != null) {
                nodeStack.push(mynode.right);
            }
            if (mynode.left != null) {
                nodeStack.push(mynode.left);
            }
        }
    }

    public static void main(String args[])
    {
        BinaryTree bt = new BinaryTree();
        bt.root = new Node(10);
        bt.root.left = new Node(8);
        bt.root.right = new Node(2);
        bt.root.left.left = new Node(3);
        bt.root.left.right = new Node(5);
        bt.root.right.left = new Node(2);
        bt.iterativePreorder();
    }
}

// This code has been contributed by Mayank Jaiswal

