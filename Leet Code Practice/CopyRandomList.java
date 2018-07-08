

public class CopyRandomList
{
   public RandomListNode copyRandomList(RandomListNode head) {
       RandomListNode temp = head;
       RandomListNode next = null;
       RandomListNode randomhead = null;
       while(temp!=null)
       {
           next = new RandomListNode(temp.label);
           if(randomhead == null)
                randomhead = next;
           next.next = temp.next;
           temp.next = next;
           temp = temp.next.next;
       }
       
       temp = head;
       
       
       while(temp!=null)
       {
           if(temp.random!=null)
                temp.next.random = temp.random.next;
           temp = temp.next.next;
        }
       
       temp = head;
      
       
       while(temp!=null)
       {
           next  =temp.next;
           temp.next = temp.next.next;
           temp = temp.next;
           if(temp!=null)
                next.next = temp.next; 
           
        }
        
        return randomhead;
   }
}
