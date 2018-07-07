

public class ReorderList
{
    public void reorderList(ListNode head) {
        if(head ==null || head.next == null)
            return ;
            
        int size = 1;
        
        ListNode temp = head;
        while(temp.next!=null)
        {
            temp= temp.next;
            size++;
        }
        
        ListNode arr[] = new ListNode[size];
        temp = head;
        int i=0;
        while(temp!= null)
        {
            arr[i] = temp;
            temp = temp.next;
            i++;
        }
        
        size--;
        i=0;
        while(i<size){
            if(size - i <=1)
                break;
            arr[i].next = arr[size];
            arr[size].next = arr[i+1];
            i++;
            size--;
        }
        
        arr[size].next = null;
    }   
}
