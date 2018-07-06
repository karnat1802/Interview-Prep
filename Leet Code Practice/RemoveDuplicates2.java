

public class RemoveDuplicates2
{
    public ListNode deleteDuplicates(ListNode head) {
        if(head ==null && head.next == null)
        {
            return head;
        }
        
        ListNode unique = null;
        ListNode uniquehead = null;
        ListNode curr = head;
        int c;
        while(curr!=null)
        {
            c = 0;
            while(curr.next!=null && curr.next.val == curr.val)
            {
                curr = curr.next;
                c = 1;
            }
            if (c==0)
            {
                if(unique ==null)
                {
                    unique = curr;
                    uniquehead = curr;
                }
                else{
                    unique.next  = curr;
                    unique = unique.next;
                }
            }
            
            curr = curr.next;
        }
        if(uniquehead == null)
            return null;
        
        unique.next = null;    
        return uniquehead;    
        
        
    }
}
