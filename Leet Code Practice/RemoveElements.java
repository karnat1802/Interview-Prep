import java.io.*;
import java.util.*;
public class RemoveElements
{
    public ListNode removeElements(ListNode head, int val) {
        if(head == null)
            return null;
        
        if(head.next == null && head.val !=val)
            return head;
        
        if(head.next == null && head.val == val)
            return null;
            
        ListNode temp = null;
        ListNode curr = head;
        
        while(curr!=null)
        {
            if(curr.val!=val)
            {
                if(temp!=null)
                {
                temp.next = curr;
                temp = temp.next;
                }
                else
                {
                    temp = curr;
                    head = temp;
                }
            }
            curr = curr.next;
        }
        if(temp == null)
            return temp;
        
        temp.next = null;
        return head;
    }
}
