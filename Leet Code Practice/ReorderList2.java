

public class ReorderList2
{
    public static String listNodeToString(ListNode node) {
    if (node == null) {
        return "[]";
    }

    String result = "";
    while (node != null) {
        result += Integer.toString(node.val) + ", ";
        node = node.next;
    }
    return "[" + result.substring(0, result.length() - 2) + "]";
    }
    
    public void reorderList(ListNode head)
    {
        if(head == null || head.next != null )
            return ;
            
        ListNode walker = head;
        ListNode runner = head;
        
        while(runner.next!=null && runner.next.next!=null)
        {
            walker = walker.next;
            runner = runner.next.next;
        }
        
        
        ListNode prev = null;
        ListNode next = null;
        ListNode curr = walker.next;
        
        while(curr!=null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        walker.next = prev;
        
        System.out.println(listNodeToString(head));
        ListNode p1 = head;
        ListNode p2 = walker.next;
        
        while(p1!=walker)
        {
            walker.next = p2.next;
            p2.next = p1.next;
            p1.next = p2;
            p1 = p2.next;
            p2 = walker.next;
        }
    }
}


