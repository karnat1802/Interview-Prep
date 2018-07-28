public class ValiDateBST{
    
    private long min = (long) Integer.MIN_VALUE - 1;
    public boolean isValidBST(TreeNode root) {
        
        if(root == null)
             return true;
        
        if(!(isValidBST(root.left)))
             return false;
        
        if(!(min < root.val))
             return false;
        
        min = root.val;
        
        
        
        return isValidBST(root.right);
    }
}