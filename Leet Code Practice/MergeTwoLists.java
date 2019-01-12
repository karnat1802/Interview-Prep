import java.io.*;
import java.util.*;    
public class MergeTwoLists
{
   public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null)
            return l2;
        if(l2 == null)
            return l1;
        ListNode head = null;
        ListNode curr = null;
        while(l1 != null || l2 != null){
            ListNode dummy = null;
            if (l1 == null){
                dummy = new ListNode(l2.val);
                l2 = l2.next;
            }
            
            else if ( l2 == null){
                dummy = new ListNode(l1.val);
                l1 = l1.next;
            }    
            else if(l1.val <= l2.val)
            {
                dummy = new ListNode(l1.val);
                l1 = l1.next;
            }       
            else {
                dummy = new ListNode(l2.val);
                l2 = l2.next;
            }
            
            
            if (head == null){
                head = dummy;
                curr = head;
            }
            else{
                curr.next = dummy;
                curr = curr.next;
           }
        }
        return head; 
    }
}
