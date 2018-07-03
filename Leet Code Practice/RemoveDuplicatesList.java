import java.io.*;
import java.util.*;
public class RemoveDuplicatesList
{
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
            
        if(head == null || head.next==null)
            return head;
        else{
            
            ListNode curr = head;
            while(curr!=null)
            {
                if(curr.next!=null && curr.next.val != curr.val)
                {
                    temp.next = curr.next;
                    temp = temp.next;
                }
                curr = curr.next;
            }
        }
        temp.next = null;
        return head;
        
    }
}
