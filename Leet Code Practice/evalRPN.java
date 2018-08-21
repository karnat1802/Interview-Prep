
import java.util.*;
public class evalRPN
{
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<Integer>();
        int a,b;
        for(String s: tokens)
        {
          if(s.equals("+"))
          {
              stack.push(stack.pop() + stack.pop() );
          }
          else if(s.equals("*"))
          {
              stack.push(stack.pop() * stack.pop() );
          }
          else if(s.equals("-"))
          {
              b = stack.pop();
              a = stack.pop();
              stack.push(a-b); 
          }
          else if(s.equals("/"))
          {
              b = stack.pop();
              a = stack.pop();
              stack.push(a/b);
          }  
          else{
              stack.push(Integer.parseInt(s));
              
          }
        }
        return stack.pop();
    }
    }

