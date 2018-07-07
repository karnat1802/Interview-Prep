

public class ReverseList2
{
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (head == null)
            return head;
            
        if(m==1)
            return ReverseList(head, m, n);
            
        ListNode temp = head;
        int count = 1;
        
        while(temp!=null)
        {
            if(count + 1 == m){
                temp.next = ReverseList(temp.next,m,n);
                break;
            }
            temp = temp.next;
            count++;
        }
        
        return head;
    }
    
    public ListNode ReverseList(ListNode curr, int m , int n)
    {
        int i = 0;
        ListNode prev = null;
        ListNode next = null;
        ListNode tail = null;
        while (i<(n-m+1))
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            if(i==0)
                tail = curr;
            curr = next;
            i++;
        }
        
        if(curr!=null)
            tail.next = curr;
        return prev;    
    }
}
