

public class DeleteNodeBST
{
    public TreeNode deleteNode(TreeNode root, int key) {
         return delete(root,key);
    }
    
    
    public TreeNode delete(TreeNode root, int key)
    {
        if(root == null)
            return root;
            
        
        else if (root.val < key)
            root.right = delete(root.right, key);
            
        else if (root.val > key)
            root.left = delete(root.left, key);
            
        else{
            
            if(root.right == null && root.left == null)
                return null;
                
            else if(root.right == null && root.left!=null)
                root= root.left;
                
            else if(root.left == null && root.right!=null)
                root = root.right;
            
            else{    
                TreeNode temp = findMin(root.right);
                root.val = temp.val;
                root.right = delete(root.right, temp.val);
            }
        }
        return root;
            
    }
    
    public TreeNode findMin(TreeNode root)
    {
        if(root.left == null)
            return root;
            
        return findMin(root.left);    
    }
}
