
public class BST extends BinarySearchTree
{
   
     public static void main(String[] args)
    {                 
        
        BinarySearchTree tree = new BinarySearchTree();
        
        tree.insert(15);
        tree.insert(23);
        tree.insert(56);
        tree.insert(95);
        tree.insert(45);
        System.out.println("Number of nodes in the tree is ");
        System.out.println(tree.countNodes());
        
        System.out.println("The values stored in the tree from min to max");
        tree.printValues();
    }
 
}
