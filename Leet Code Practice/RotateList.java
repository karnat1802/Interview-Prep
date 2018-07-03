

public class RotateList
{
   public ListNode rotateRight(ListNode head, int k) {
       if(head == null || head.next == null)
       {
           return head;
        }
       
       int size = 1;
       ListNode temp = head;
       ListNode tail = null;
       while(temp.next!=null)
       {
           temp= temp.next;
           size++;
        }
       tail = temp;
       
       int index = (size - k%size);
       int i = 1;
       ListNode curr = head;
       
       while(i!=index)
       {
           curr = curr.next;
           i++;
        }
        
       if(tail == curr)
       {
           return head;
        }
       else{
           ListNode t = curr.next;
           curr.next = null;
           tail.next = head;
           head = t;
        }
       return head; 
    }
}
