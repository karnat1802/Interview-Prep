public class InorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root == null)
             return new ArrayList<Integer>();
        List<Integer> res = new ArrayList<Integer>();
        return inorderTraversal(root, res);
    }
    
    
    public List<Integer> inorderTraversal(TreeNode root, List<Integer> res)
    {
        if(root == null)
            return res;
        
        inorderTraversal(root.left,res);
        res.add(root.val);
        inorderTraversal(root.right,res);
        
        return res;
    }
}
