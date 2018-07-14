

public class RemoveDupesUL2
{
    public void DeleteDups(ListNode head)
   {
       ListNode curr = head;
       while(curr!=null)
       {
           ListNode runner = curr;
           while(runner.next!=null)
           {
               if(runner.next.val == curr.val)
                    runner.next = runner.next.next;
               else
                    runner = runner.next; 
            }
           curr = curr.next; 
        }
   }
}
