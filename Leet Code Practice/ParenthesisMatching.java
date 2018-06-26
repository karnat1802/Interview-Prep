import java.io.*;
import java.util.*;
public class ParenthesisMatching
{
   public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
     for(char c : s.toCharArray())
     {
         if(c=='{' || c=='(' || c=='[')
             stack.push(c);
         else if(stack.isEmpty() || (c==')' && stack.peek()!='('  ))
            return false;
         else if(stack.isEmpty() || (c=='}' &&  stack.peek()!='{'))
            return false;
         else if(stack.isEmpty() || (c==']' &&  stack.peek()!='['))
            return false;
         else 
             stack.pop();
     }
     return stack.isEmpty();
    }
    }


