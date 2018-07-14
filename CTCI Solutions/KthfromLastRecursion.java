

public class KthfromLastRecursion
{
    
    public int KthfromLastRecursion(ListNode head, int k)
    {
        if(head == null)
            return 0;
            
        int index = KthfromLastRecursion(head.next, k)+1;
        
        if(index == k)
            System.out.println("The value of the Kth node is"+ head.val);
            
        return index;
        
        
    }

    
   
}
