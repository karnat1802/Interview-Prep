

public class PalindromeList2
{
    public boolean isPalindrome(ListNode head) {
        if(head == null && head.next == null)
            return true;
            
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast.next!=null && fast.next.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        slow.next = ReverseList(slow.next);
        
        slow = slow.next;
        
        while(slow!=null)
        {
            if(head.val != slow.val)
                return false;
                
            slow = slow.next;
            head = head.next;
        }
        return true;
}

public ListNode ReverseList(ListNode head)
{
    ListNode prev = null;
    ListNode next = null;
    
    while(head != null)
    {
        next = head.next;
        head.next = prev; 
        prev = head;
        head = next;
    }
    return prev;
}

}
