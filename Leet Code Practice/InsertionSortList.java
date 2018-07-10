

public class InsertionSortList
{
    public ListNode insertionSortList(ListNode head) {
        if(head == null || head.next == null)
            return head;
            
        ListNode tail = head;
        ListNode curr = head;
        
        while(tail.next!=null)
        {
            curr = tail.next;
            
            //Case 1: curr is greater than tail
            if(curr.val>=tail.val)
                tail = curr;
                
            else if(curr.val <= head.val)
            {
                tail.next = curr.next;
                curr.next = head;
                head = curr;
            }
            else {
                ListNode temp = head;
                while(temp!=tail){
                    if(temp.next.val>=curr.val)
                        break;
                    temp = temp.next;    
                }
                tail.next = curr.next;
                curr.next = temp.next;
                temp.next = curr;
            }
        }
        return head;
    }
}
