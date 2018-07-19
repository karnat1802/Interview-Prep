class flattenBST {
    
    private TreeNode processed = null;
    
    public void flatten(TreeNode root) {
        if(root == null)
            return;
        
        flatten(root.right);
        flatten(root.left);
        
        root.right = processed;
        root.left = null;
        
        processed = root;
        
    }
}   
