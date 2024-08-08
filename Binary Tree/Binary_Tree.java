
package dsa_with.java.Binarytree;

public class Binary_Tree {
    
    private TreeNode root;
    
    private class TreeNode{
        private TreeNode left;
        private TreeNode right;
        private int data;
        
        public TreeNode(int data){
           this.data = data;
        }
    }
    
    public void CreateBinaryTree(){
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);
        
        
//      second<----first----->third  lookslike
        root = first;
        first.left = second;
        first.right = third;
        
        second.left = fourth;
        second.right = fifth;
    }
    
    public static void main(String[] args) {
        
    }
}
