
public class OddEvenList
{
    public ListNode oddEvenList(ListNode head) {
        
    if(head==null || head.next==null || head.next.next == null)
         return head;
        
        
    ListNode prev = head;
    ListNode curr = head.next;
    ListNode oddhead = prev;
    ListNode evenhead = curr;
    while(curr!=null && curr.next!=null)
    {
        prev.next = curr.next;
        if(curr.next!=null)
            prev = prev.next;
        
        curr.next = prev.next;
        curr = curr.next;
    }
    
    prev.next = evenhead;
    
        
    return oddhead;
    }
}
