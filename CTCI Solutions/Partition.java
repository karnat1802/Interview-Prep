

public class Partition
{
    
    public ListNode Partition(ListNode node, int x)
    {
        ListNode head = node;
        ListNode tail = node;
        
        while(node!=null)
        {
            ListNode next = node.next;
            if(head.val < x)
            {
                node.next = head;
                head = node;
            }
            
            else{
                tail.next = node;
                tail = node;
                
            }
            node = next;
            
        }
        
        tail.next = null;
        return head;
    }

    
}
