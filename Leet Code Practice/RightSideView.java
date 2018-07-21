import java.io.*;
import java.util.*;
public class RightSideView
{
    public List<Integer> rightSideView(TreeNode root) {
            if(root == null)
                return new ArrayList<Integer>();
                
            List<Integer> res = new ArrayList<Integer>();
            Queue<TreeNode> queue = new LinkedList<TreeNode>();
            
            queue.add(root);
            
            while(!queue.isEmpty())
            {
                int nodescount = queue.size();
                for(int i = 0; i< nodescount; i++)
                {
                    
                    
                    TreeNode node = queue.remove();
                    if(i== nodescount-1)
                        res.add(node.val);
                    
                    if(node.left!=null)
                        queue.add(node.left);
                    if(node.right!=null)
                        queue.add(node.right);
                }
            }
            return res;
    }
}
