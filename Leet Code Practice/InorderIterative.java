public class InorderIterative {
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root == null)
             return new ArrayList<Integer>();
        
        Stack<TreeNode> stack = new Stack<TreeNode>();
        
        List<Integer> res= new ArrayList<Integer>();
        
        while(root!=null || !stack.isEmpty())
        {
            if(root!=null)
            {
                stack.push(root);
                root = root.left;
                continue;
            }
            
            root = stack.pop();
            res.add(root.val);
            
            root = root.right;
            
        }
        return res;
    }
    
    
}
