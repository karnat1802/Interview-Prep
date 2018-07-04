import java.io.*;
import java.util.*;
public class PalindromeList
{
    public boolean isPalindrome(ListNode head) {
        ListNode copy = null;
        int c=0;
        ListNode temp = head;
        ListNode head1 = null;
        while(temp!=null)
        {
            if(c==0)
            {
                copy = new ListNode(temp.val);
                head1 = copy;
                c++;
                temp = temp.next;
            }
            else{
                copy.next = new ListNode(temp.val);
                copy = copy.next;
                temp = temp.next;
            }
        }
        copy.next = null;
        /*Reverse the linked list */
        
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
        
        ListNode pointer1 = head;
        ListNode pointer2 = head1;
        
        while(pointer1!= null && pointer2!=null)
           {
               if(pointer1.val != pointer2.val)
                    return false;
               if (pointer1!=null)
                    pointer1 = pointer1.next;
               if(pointer2!=null)
                    pointer2 = pointer2.next;
               
            }
        return true;    
    }
}
