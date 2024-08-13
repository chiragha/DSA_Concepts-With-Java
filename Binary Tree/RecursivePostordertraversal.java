package dsa_with.java.Binarytree;

public class RecursivePostordertraversal {
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
        TreeNode first = new TreeNode(9);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        
        
        
//      second<----first----->third  lookslike
        root = first;
        first.left = second;
        first.right = third;
        
        second.left = fourth;
       
    }
    
    public void RecursivePostordertraversal(TreeNode root) {
        if(root == null)
        {
          return;
         }
         RecursivePostordertraversal(root.left);
         RecursivePostordertraversal(root.right);
         System.out.print(root.data + "");
     }
    
    public static void main(String[] args) {
//        preOrder(root);
        RecursivePostordertraversal rpot = new RecursivePostordertraversal();
        rpot.CreateBinaryTree();
        rpot.RecursivePostordertraversal(rpot.root);

    }
}
