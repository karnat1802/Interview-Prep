

public class checkBalanced
{
    
    public boolean checkBalanced(TreeNode root)
    {
        if(root == null)
            return true;
            
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        
        if (rightHeight - leftHeight > 1 || leftHeight - rightHeight > 1 )
            return false;
            
        return checkBalanced(root.left) && checkBalanced(root.right);    
        
    }
    
    public int getHeight(TreeNode root)
    {
        if(root == null)
            return 0;
            
        int leftHeight = getHeight(root.left);
        
        int rightHeight = getHeight(root.right);
        
        return Math.max(leftHeight, rightHeight) + 1;
        
    }

    
}
