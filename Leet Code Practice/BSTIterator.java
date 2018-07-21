
import java.util.*;
import java.io.*;
public class BSTIterator {
    Stack<TreeNode> stack;
    public BSTIterator(TreeNode root) {
        stack = new Stack<TreeNode>();
        TreeNode curr = root;
        while(curr!=null)
        {
            stack.push(curr);
            if(curr.left!=null)
            {
                curr = curr.left;
            }
            else{
                break;
            }
        }
        
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !stack.isEmpty();
        
    }

    /** @return the next smallest number */
    public int next() {
        TreeNode node = stack.pop();
        TreeNode curr = node;
        if(curr.right!=null)
        {
            curr = curr.right;
            while(curr!= null)
            {
                stack.push(curr);
                if(curr.left!= null)
                {
                    curr = curr.left;
                }
                else{
                    break;
                }
            }
        }
        return node.val;
        
    }
}