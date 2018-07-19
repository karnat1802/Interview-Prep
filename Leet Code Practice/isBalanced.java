import java.io.*;
public class isBalanced
{
    public boolean isBalanced(TreeNode root) {
        if(root == null)
            return true;
            
        if(getHeight(root.left)-getHeight(root.right)>1 || getHeight(root.left)-getHeight(root.right)<-1 )
            return false;
            
        return isBalanced(root.left) && isBalanced(root.right);    
    }
    
    public int getHeight(TreeNode root)
    {
        if(root == null)
            return 0;
            
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        
        return Math.max(leftHeight,rightHeight)+1;
    }
}
