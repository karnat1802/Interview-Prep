import java.util.Scanner;
import java.io.*;
public class BinarySearchTree extends BSTNode 
{
    private BSTNode root;
    public BinarySearchTree()
    {
       root = null;
    }
    
    void insert(int data)
    {
        root = insert(root,data);
    }
    
    public BSTNode insert(BSTNode root, int data)
    {
        if(root == null){
            root = new BSTNode(data);
                
        }
        else if(data<= root.data)
            root.left = insert(root.left, data);
        
        else
            root.right =  insert(root.right, data);
        
        return root;    
    }
    
    public int countNodes()
    {
        return count(root);
    }
    
    public int count(BSTNode root)
    {
       if (root == null)
             return 0;
         else
         {
             int l = 1;
             l += count(root.left);
             l += count(root.right);
             return l;
         }
    }
    
    public void printValues()
    {
        inorderTreeTraversal(root);
    }
    
    public void inorderTreeTraversal(BSTNode root)
    {
        if(root == null)
            return;
        inorderTreeTraversal(root.left);
        System.out.println(root.data);
        inorderTreeTraversal(root.right);
        
    }
    
}


