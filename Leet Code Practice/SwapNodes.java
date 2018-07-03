import java.io.*;
import java.util.*;
public class SwapNodes
{
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null)
            return head;
            
        else{
            ListNode prev = head;
            ListNode curr = head;
            ListNode next = head;
            int c = 0;
            
            while(curr!=null && next!=null && next.next!=null)
            {
                prev = curr;
                
                curr = curr.next;
                
                next = curr.next;
                
                prev.next = next;
                curr.next = prev;
                if(c==0)
                    {
                        head = curr;
                        c++;
                    }
                curr = next;
                if(next!=null && next.next!=null)
                    prev.next = next.next;
            }
        }
        return head;
    }
}
