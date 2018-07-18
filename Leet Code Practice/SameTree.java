
import java.util.*;
public class SameTree
{
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null)
            return true; 
       if(p==null && q!=null)
            return false;
            
        if (p!=null && q==null)
            return false;
           
        if(p.val != q.val)
            return false;
        TreeNode temp1 = p;
        TreeNode temp2 = q;
        Queue<TreeNode> q1 = new LinkedList<TreeNode>();
        Queue<TreeNode> q2 = new LinkedList<TreeNode>();
        q1.add(p);
        q2.add(q);
        
        while(temp1 != null && temp2!=null && !q1.isEmpty() && !q2.isEmpty())
        {
            temp1 = q1.remove();
            temp2 = q2.remove();
                
            if(temp1.left!=null && temp2.left == null)
                return false;
                
            if(temp1.right!=null && temp2.right == null)
                return false;
                
            if(temp1.left==null && temp2.left != null)
                return false;
                
            if(temp1.right==null && temp2.right != null)
                return false;
            
            if(temp1.val != temp2.val)
                return false;
            
            if(temp1.left!=null)
                q1.add(temp1.left);    
            if(temp1.right!=null)
                q1.add(temp1.right);
            if(temp2.left!=null)
                q2.add(temp2.left);
            if(temp2.right!=null)
                q2.add(temp2.right);
        }
        
        return true;  
    }
}
