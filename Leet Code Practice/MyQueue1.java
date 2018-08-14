
import java.util.*;
public class MyQueue1
{
    Stack<Integer> output;
    Stack<Integer> input;
    
     public MyQueue1() {
        output = new Stack<Integer>();
        input = new Stack<Integer>();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        input.push(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        peek();
        return output.pop();
    }
    
    /** Get the front element. */
    public int peek() {
        if(output.isEmpty())
        {
            while(!input.isEmpty())
            {
                output.push(input.pop());
            }
        }
        return output.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return output.isEmpty() && input.isEmpty();
    }
}
