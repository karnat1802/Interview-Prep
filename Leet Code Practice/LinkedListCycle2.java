

public class LinkedListCycle2
{
    public ListNode detectCycle(ListNode head) {
        if(head ==null)
            return null;
            
        ListNode walker = head;
        ListNode runner = head;
        
        while(runner.next!=null && runner.next.next!=null )
        {
            walker = walker.next;
            runner = runner.next.next;
            
            if(walker == runner)
            {    
                ListNode start = head;
                while(start != walker){
                    walker = walker.next;
                    start = start.next;
                }
                return start;
            }   
        }
        
        return null;
    }
}
