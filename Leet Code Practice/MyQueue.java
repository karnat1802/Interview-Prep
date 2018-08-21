
import java.util.*;
public class MyQueue
{
    /** Initialize your data structure here. */
    Stack<Integer> stack;
    
     public MyQueue() {
        stack = new Stack<Integer>();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        if(stack.isEmpty())
            stack.push(x);
            
        else
        {
            List<Integer> list = new ArrayList<Integer>();
            
            while(!stack.isEmpty())
            {
                list.add(stack.pop());
            }
            
            stack.push(x);
            for(int i = list.size()-1; i>=0;i--)
            {
                stack.push(list.get(i));
            }
        }
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        return stack.pop();
    }
    
    /** Get the front element. */
    public int peek() {
        return stack.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack.isEmpty();
    }
}
