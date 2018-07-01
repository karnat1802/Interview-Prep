import java.io.*;
import java.util.*;
public class RemoveNthFromEnd
{
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = 0;
        ListNode curr = head;
        
        while(curr!=null)
        {
            curr = curr.next;
            size++;
        }
        
        int pos = size - n;
        
        if(pos ==0)
        {
            head = head.next;
            return head;
        }
        
        else
        {
            
            ListNode temp = head;
            ListNode prev = head;
            int index =  0;
            while(index!=pos)
            {
                prev = temp;
                temp = temp.next;
                index++;
            }
            prev.next = temp.next;
            return head;
        }
    }
}
