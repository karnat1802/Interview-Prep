import java.io.*;
import java.util.*;
public class BinaryTreePaths
{
    public List<String> binaryTreePaths(TreeNode root) {
        if(root == null)
            return new ArrayList<String>();
            
        List<String> res = new ArrayList<String>();
        
        return binaryTreePaths(root, res, "", 0);
    }
    
    public List<String> binaryTreePaths(TreeNode root, List<String> res,String str, int c)
    {
        if(root.left == null && root.right == null)
        {    
            if ( c == 0)
                str = str + root.val;
            else
                str = str + "->" + root.val;
        
            res.add(str);
            return res;
        }
        
        if ( c == 0)
            str = str + root.val;
        else
            str = str + "->" + root.val;
        
        if(root.left!=null)
            res = binaryTreePaths(root.left, res, str,1 );
            
            
        if(root.right!=null)
            res = binaryTreePaths(root.right, res, str, 1);
            
        return res;    
    }
}
