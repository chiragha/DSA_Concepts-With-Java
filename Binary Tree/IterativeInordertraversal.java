
package dsa_with.java.Binarytree;

import java.util.Stack;

public class IterativeInordertraversal {
    TreeNode root;

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
      
        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
          }
    
    public void IterativeInordertraversal(TreeNode root) {
        if(root == null)
            {
            return;
             }
            Stack<TreeNode> stack =new Stack<>();
            TreeNode temp = root;
            while(!stack.isEmpty() || temp != null){
            if(temp != null){
            stack.push(temp);
            temp = temp.left;
            }else{
             temp = stack.pop();
             System.out.print(temp.data+"");
             temp = temp.right;
            }
            } 
     }
    
    
    public static void main(String[] args) {
        
        IterativeInordertraversal iit = new IterativeInordertraversal();
        iit.CreateBinaryTree();
        iit.IterativeInordertraversal(iit.root);
    }
}
