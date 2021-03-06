
import java.util.*;
public class find132Pattern
{
    class Pair
    {
        int max;
        int min;
        public Pair(int min , int max)
        {
             this.min = min;
             this.max = max;
             
        }
    }
    public boolean find132pattern(int[] nums) {
        Stack<Pair> stack = new Stack<Pair>();
        
        for(int n : nums)
        {
            if(stack.isEmpty() || n< stack.peek().min)
                stack.push(new Pair(n,n));
                
            else if(n>stack.peek().min)
            {
                Pair last = stack.pop();
                if(n<last.max)
                    return true;
                else
                {
                    last.max = n;
                    while(!stack.isEmpty() && n>=stack.peek().max)
                    {
                        stack.pop();
                    }
                    if(!stack.isEmpty() && stack.peek().min < n)
                        return true;
                    stack.push(last);    
                }
            }
            
        }
        return false;
    }
        
}
