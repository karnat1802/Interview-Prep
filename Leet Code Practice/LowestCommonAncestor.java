

public class LowestCommonAncestor
{
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (((root.val - p.val) * (root.val - q.val)) < 1)
            return root;
            
        return lowestCommonAncestor((p.val<root.val)?root.left: root.right, p , q);
        
    }
}
