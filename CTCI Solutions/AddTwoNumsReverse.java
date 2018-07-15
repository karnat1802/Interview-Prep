

public class AddTwoNumsReverse extends PartialSum
{
    public ListNode addLists(ListNode l1, ListNode l2)
    {
        int count1=0;
        ListNode temp = l1;
        while(temp!=null)
        {
            temp = temp.next;
            count1++;
        }
        
        temp = l2;
        int count2 = 0;
        while(temp!=null)
        {
            temp = temp.next;
            count2++;
        }
        
        if(count1> count2)
        {
            l2 = padList(l2, count1 - count2);
        }
        
        else if(count2 > count1 )
        {
            l1 = padList(l1, count2 - count1);
        }
        
        PartialSum sum = addListsHelper(l1, l2);
        
        if(sum.carry == 0)
            return sum.sum;
        else{
            ListNode res = sum.sum;
            ListNode head = new ListNode(1);
            head.next = res;
            return head;
        }
    }
    
    public PartialSum addListsHelper(ListNode l1, ListNode l2)
    {
        if(l1 == null && l2 == null)
        {
            PartialSum sum = new PartialSum();
            return sum;
        }
        PartialSum sum = addListsHelper(l1.next, l2.next);
        int val = l1.val + l2.val + sum.carry;
        
        if(sum.sum==null)
            sum.sum = new ListNode(val%10);
        
        else
        {
            ListNode n = new ListNode(val%10);
            n.next = sum.sum;
            sum.sum = n.next;
        }
        
        sum.carry = val/10;
        return sum;
    }
    
    public ListNode padList(ListNode l1, int count)
    {
        ListNode head = l1;
        for(int i = 0 ;  i<count; i++ )
        {
            ListNode n = new ListNode(0);
            n.next = head;
            head = n;
        }
        return head;
    }
    
}
