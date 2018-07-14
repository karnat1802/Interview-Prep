import java.util.*;
import java.io.*;
public class RemoveDupesUL
{
   public void DeleteDups(ListNode head)
   {
       ListNode prev = null;
       HashSet<Integer> set = new HashSet<Integer>();
       
       while(head!=null)
       {
           if(set.contains(head.val))
                prev.next = head.next;
           else{
               set.add(head.val);
               prev = head;
            }
           head = head.next ;
        }   
   }
}
