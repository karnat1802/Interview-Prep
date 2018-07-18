
import java.io.*;
import java.util.*;
public class LevelOrderTraversal2
{
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new LinkedList<List<Integer>>();
         
         if(root == null)
            return res;
            
         Queue<TreeNode> q = new LinkedList<TreeNode>();
         q.add(root);
         while(!q.isEmpty())
         {
             int countNodes = q.size();
             List<Integer> values = new LinkedList<Integer>();
             for(int i=0; i<countNodes; i++)
             {
                 TreeNode p = q.remove();
                 
                 values.add(p.val);
                 
                 if(p.left!=null)
                    q.add(p.left);
                 if(p.right!=null)
                    q.add(p.right);
                 
             }
             res.add(0,values);
             
         }
         return res;
    }
}
