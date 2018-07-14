

public class KthfromLast
{
    
    public int KthfromLast(ListNode head, int k)
    {
        if(head == null || head.next == null)
            return head.val;
            
        ListNode curr = head;
        int len = 0;
        while(curr!=null)
        {
            curr = curr.next;
            len++;
        }
        
        int pos = len - k;
        int count = 0;
        curr = head;
        while(count!=pos)
        {
            curr = curr.next;
            count++;
        }
        
        return curr.val;
    }

    
    
}
