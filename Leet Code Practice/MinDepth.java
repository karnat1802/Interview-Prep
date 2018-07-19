
import java.io.*;
public class MinDepth
{
    public int minDepth(TreeNode root) {
        if(root == null)
            return 0;
            
        int right = minDepth(root.right);
        int left = minDepth(root.left);
        
        if(right == 0 && left!=0)
            return left+1;
            
        else if(left == 0 && right!=0)
            return right+1;
            
        else if(left == 0 && right == 0 )
            return 1;
            
        else
        {
            return Math.min(left, right) + 1;
        }
            
    }
   
}
