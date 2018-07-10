
public class BST extends BinarySearchTree
{
   
     public static void main(String[] args)
    {                 
        
        BinarySearchTree tree = new BinarySearchTree();
        
        tree.insert(15);
        tree.insert(20);
        tree.insert(10);
        tree.insert(18);
        tree.insert(22);
        tree.insert(4);
        tree.insert(12);
        tree.insert(14);
        tree.insert(24);
        System.out.println("Number of nodes in the tree is ");
        System.out.println(tree.countNodes());
        
        System.out.println("The values stored in the tree from min to max");
        tree.printValuesInOrder();
        
        System.out.println("The min value in the node is ");
        tree.findMin();
        
        System.out.println("The max value in the node is ");
        tree.findMax();
        
        System.out.println("Check if value "+21+" is in Tree: " +tree.is_in_tree(21));
        
        System.out.println("Height of the tree is "+tree.getHeight());
        
        System.out.println("Is the tree a BST? "+tree.isBST());
    }
 
}
