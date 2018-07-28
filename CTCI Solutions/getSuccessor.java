

public class getSuccessor
{
   
    public TreeNode getSuccessor(TreeNode root, TreeNode p)
    {
        TreeNode successor = null;
        TreeNode ancestor = root;
        if(p.right!= null)
        {
            TreeNode node = findMin(p.right);
        }
        
        else{
            
            
            while(ancestor != p)
            {
                if(p.val < root.val)
                {
                    successor = ancestor;
                    ancestor = ancestor.left;
                }
                else
                    ancestor = ancestor.right;
            }
            
        }
        return successor;
        
    }
    
    public TreeNode findMin(TreeNode root)
    {
        if(root.left == null)
            return root;
            
        return findMin(root.left);    
    }
}
