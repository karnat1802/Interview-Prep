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
}

class BST
 {
     public static void main(String[] args)
    {                 
        Scanner sc = new Scanner(System.in);
        BinarySearchTree tree = new BinarySearchTree();
        
        tree.insert(15);
        tree.insert(23);
        tree.insert(56);
        tree.insert(95);
        tree.insert(45);
        
    }
 }
