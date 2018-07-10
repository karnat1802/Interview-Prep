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
    
    public void printValuesInOrder()
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
    
    public void findMin()
    {
        BSTNode min = findMin(root);
        System.out.println(min.data);
    }
    
    public BSTNode findMin(BSTNode root)
    {
        if(root.left == null)
        {
            
            return root;
        }
        
        return findMin(root.left);
        
    }
    
    public void deleteTree(){
        root = null;
    }
    
    public void findMax()
    {
        BSTNode max = findMax(root);
        System.out.println(max.data);
    }
    
    public BSTNode findMax(BSTNode root)
    {
        if(root.right == null)
            return root;
         
        return findMax(root.right);    
    }
    
    public void delete(int val)
    {
        root = deleteNode(root, val);
    }
    
    public boolean is_in_tree(int val)
    {
        return is_in_tree(root,val);
    }
    
    public boolean is_in_tree(BSTNode root, int val)
    {
        if(root == null)
        {
            return false;
        }
        
        else if(root.data < val)
            return is_in_tree(root.right, val);
            
        else if(root.data > val)
            return is_in_tree(root.left, val);
            
        else{
            return true;
        }
    }
    
    public int getHeight(){
        return getHeight(root);
    }
    
    public int getHeight(BSTNode root)
    {
        if(root == null)
            return 0;
            
        int heightOfLeft = getHeight(root.left);
        int heightOfRight = getHeight(root.right);
        
        return Math.max(heightOfLeft, heightOfRight)+1;
    }
    
    public boolean isBST()
    {
        return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE)
;    }
    
    public boolean isBST(BSTNode root, int min, int max){
        if(root == null)
            return true;
        
        else if(root.data > max || root.data < min)
            return false;
             
        if(isBST(root.left,min,root.data ) && isBST(root.right,root.data, max)) 
            return true;
        return false;
    }
    
    public BSTNode deleteNode(BSTNode root,int val)
    {
        if(root == null){
            System.out.println("Node to be delted is not found");
            return root;
        }
        
        else if(root.data < val)
            root.right = deleteNode(root.right, val);
        
        else if(root.data > val)
            root.left = deleteNode(root.left, val);
            
        else{
            //Node to delete is the leaf node
           if(root.left == null && root.right == right)
                return null;
           
           else if(root.left==null && root.right!=null)
           {
               root = root.right;
               
           }
            
           else if(root.right == null && root.left!=null)
           {
               root = root.left;
           }
           
           else{
               BSTNode temp = findMin(root.right);
               root.data = temp.data;
               root.right = deleteNode(root.right,temp.data);
           }                
        }
        return root;
    }
    
}


