import java.io.*;
import java.util.*;
public class RemDupesUnsortedList
{
   public ListNode removeDuplicates(ListNode head) {
      if(head == null || head.next!=null )
        return head;
      
      ListNode curr = head;
      ListNode temp = head;
      
      List<Integer> res = new ArrayList<Integer>();
      res.add(head.val);
      boolean unique;
      while(curr.next!=null)
      {
          unique = true;
          for(int i=0; i<res.size(); i++){
              if(curr.next.val == res.get(i))
                    unique = false;
            }
          
          if(unique == true){
              temp.next = curr.next;
              temp = temp.next;
              res.add(curr.next.val);
            }
          curr = curr.next;
      }
      temp.next = null;
      return head;
   }
}
