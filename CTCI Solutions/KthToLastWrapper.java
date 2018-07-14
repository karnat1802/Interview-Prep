

public class KthToLastWrapper extends Index
{
    public ListNode kthTotheLast(ListNode head, int k)
    {
        Index idx = new Index();
        return kthTotheLast(head, k, idx);
    }
    
    public ListNode kthTotheLast(ListNode head, int k , Index idx )
    {
        if(head == null)
            return null;
            
        ListNode temp = kthTotheLast(head.next,k,idx);
        idx.value = idx.value + 1;
        if(idx.value == k)
            return head;
           
        return head;    
    }
}
