import java.io.*;
import java.util.*;
public class ReverseList
{
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next==null)
            return head;
        ListNode prev = null;
        ListNode next = null;
        ListNode curr = head;
        while(curr!=null)
        {
            next = curr.next;
            curr.next = prev;
            
            prev = curr;
            curr = next;
        }
        head = prev;
        return head;
    }
}
