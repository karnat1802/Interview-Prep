
import java.util.*;
public class ListOfDepths
{
    
    public ArrayList<LinkedList<TreeNode>> ListOfDepths(TreeNode root)
    {
      if(root == null)
        return new ArrayList<LinkedList<TreeNode>>();
        
      Queue<TreeNode> queue = new LinkedList<TreeNode>();
      queue.add(root);
      ArrayList<LinkedList<TreeNode>> res = new ArrayList<LinkedList<TreeNode>>();
      while(!queue.isEmpty())
      {
          int nodescount = queue.size();
          LinkedList<TreeNode> list = new LinkedList<TreeNode>();
          
          for(int i = 0; i< nodescount; i++)
          {
              TreeNode node = queue.remove();
              list.add(node);
              if(node.left != null)
                 queue.add(node.left);
                 
              if(node.right != null)
                queue.add(node.right);
          }
          
          res.add(list);
      }
      
      return res;
    }
}
