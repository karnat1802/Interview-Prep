
public class DeleteMiddleElement
{
    
    public void DeleteMiddleElement(ListNode node)
    {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    
}
