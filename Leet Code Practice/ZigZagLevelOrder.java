
import java.io.*;
import java.util.*;
public class ZigZagLevelOrder
{
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new LinkedList<List<Integer>>();
        
        if (root == null)
            return res; 
        
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        int  c = -1;
        q.add(root);
        while(!q.isEmpty())
        {
            int countNodes = q.size();
            ++c;
            List<Integer> values = new LinkedList<Integer>();
            
            for(int i=0; i<countNodes; i++)
            {
                TreeNode p = q.remove();
                
                if(c%2 == 0)
                    values.add(p.val);
                else
                    values.add(0, p.val);
                
                
                if(p.left!=null)
                    q.add(p.left);
                
                if(p.right!=null)
                    q.add(p.right);
                
            }
            res.add(values);
            c = c * -1;
        }
        return res;
    }
}
