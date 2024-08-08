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
