

public class SortedListtoBST
{
    public TreeNode sortedListToBST(ListNode head) {
        if(head == null)
            return null;
        
        TreeNode root = convertToBST(head, null);
        return root; 
    }
    
    public TreeNode convertToBST(ListNode head, ListNode tail)
    {
        TreeNode node = null;
        
        if(head!=tail)
        {
            ListNode slow = head;
            ListNode fast = head;
            
            while(fast!=tail && fast.next!=tail)
            {
                slow = slow.next;
                fast = fast.next.next;
            }
            
            node = new TreeNode(slow.val);
            
            node.left = convertToBST(head,slow);
            node.right = convertToBST(slow.next,tail);
            
            
        }
        return node;
    }
}

 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
