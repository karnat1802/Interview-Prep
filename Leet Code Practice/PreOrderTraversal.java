
import java.io.*;
import java.util.*;
public class PreOrderTraversal
{
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        return preorder(root,res);
    }
    
    public List<Integer> preorder(TreeNode root, List<Integer> res)
    {
        if(root == null)
            return res;
            
        res.add(root.val);
        preorder(root.left,res);
        preorder(root.right,res);
        
        return res;
    }
    
}
