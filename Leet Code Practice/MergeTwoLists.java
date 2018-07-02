import java.io.*;
import java.util.*;    
public class MergeTwoLists
{
   public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode curr = null;
        ListNode head = null;
        ListNode n = null;
        //Deal with edge cases
        if(l1 == null)
            return l2;
            
        if (l2 == null)
            return l1;
            
        if(l1.val<= l2.val)
        {
           
            n= new ListNode(l1.val);
            curr = n;
            head = n;
            l1 = l1.next;
            // listNodeToString(curr);
        }
        
        else{
           
            n= new ListNode(l2.val);
            curr = n;
            head = n;
            l2 = l2.next;
            // listNodeToString(curr);
        }
        
        while(l1!=null || l2!=null)
        {
            if(l1 == null)
            {
                
                curr.next = l2;
                
                return head;
                
            }
            
            else if (l2 == null)
            {
                
                curr.next = l1;
                
                return head;
                
            }
            
            
            else if(l1!=null && l2!=null && l1.val <= l2.val)
            {
                
                n= new ListNode(l1.val);
                
                curr.next = n;
                curr = curr.next;
                
                l1 = l1.next;
                
                
            }
            
            else if(l1!=null && l2!=null && l2.val < l1.val)
            {
                
                n= new ListNode(l2.val);
                
                curr.next = n;
                curr = curr.next;
                
                l2 = l2.next;
               
                
            }
            
            
        }
        
        return head;
    }
}
