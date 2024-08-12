# Binary Tree

* It is a non-linear Data Structure used for storing data.
* It is made up of nodes and edges without having any circle.
* Each node in a tree can point to n number of nodes in a tree.
* It is a way of representing hierarchical structure of a parent node called as root and many levels of additional nodes.

## A tree is called as Binary Tree, if each node has zero, one or two children.

Basic code structure:
```
public class TreeNode {
  private int data;
  private TreeNode left;
  private TreeNode Right;

  public TreeNode(int data){
    this.data = data;
  }
}
```

# Recursive PreOrder Traversal of a Binary Tree

* Visit the root node.
* Traverse the left subtree in Pre order fashion.
* Traverse the right subtree in Pre order fashion.

Basic code structure:
```
public void preOrder(TreeNode root) {
  if(root == null)
  {
    return;
   }
   System.out.print(root.data + "")
   preOrder(root.left);
   preOrder(root.right);
}
```


# Iterative PreOrder Traversal of a Binary Tree

Basic code structure:
```
  if(root == null)
  {
  return;
   }
  while(!stack.isEmpty()){
  TreeNode temp = stack.pop();
  System.out.println(temp.data);
     if(temp.right!=null){
       stack.push(temp.right);
      }
     if(temp.left!=null){
       stack.push(temp.left);
      }
  }
```

# Recursive Inorder Traversal of a Binary Tree

* Traverse the left subtree in In order fashion.
* Visit the root node
* Traverse the right subtree in In order fashion.

Basic code structure:
```
public void inOrder(TreeNode root){
  if(root == null)
  {
  return;
   }
  inOrder(root.left);
  System.out.print(root.data+"");
  inOrder(root.right);
  }
```

# Iterative Inorder traversal of a Binary Tree

Basic code structure:
```

  if(root == null)
  {
  return;
   }
  Stack<TreeNode> stack = Stack<>();
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
  
```


