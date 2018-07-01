
import java.io.*;
import java.util.*;




public class AddTwoNumbers
{
   public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       ListNode curr = null;
       ListNode head = null;
       int sum = 0;
       int carry = 0;
       
       while (l1!=null || l2!=null)
       {
           sum = carry;
           if(l1!=null){
               sum += l1.val;
               l1=l1.next;
            }
           
           if(l2!=null){
               sum += l2.val;
               l2=l2.next;
            }
           ListNode n = new ListNode(sum%10);
           
           if(curr==null){
               curr = n;
               head = n;
            }
            else
            {
                curr.next = n;
                curr = n;
            }
           
           carry = sum % 10; 
       }
       
       if(carry>1)
       {
           curr.next = new ListNode(1);
        }
        
       return head!= null ? head : new ListNode(0);
    }
    
}
