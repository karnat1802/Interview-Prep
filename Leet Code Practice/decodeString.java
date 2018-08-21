import java.util.*;

public class decodeString
{
    public String decodeString(String s) {
        Stack<String> resStack = new Stack<>();
        Stack<Integer> countStack = new Stack<>();
        String res = "";
        
        int idx = 0;
        while(idx < s.length())
        {
            if(Character.isDigit(s.charAt(idx)))
            {
                int count = 0;
                while(Character.isDigit(s.charAt(idx)))
                {
                    count = 10 * count + s.charAt(idx) - '0';
                    idx++;
                }
                countStack.push(count);
                idx++;
            }
            
            else if(s.charAt(idx) == '[')
            {
                resStack.push(res);
                res = "";
                idx++;
            }
            else if(s.charAt(idx)==']')
            {
                StringBuilder temp = new StringBuilder(resStack.pop());
                int repeat = countStack.pop();
                for(int i = 0 ; i< repeat; i++)
                {
                    temp.append(res);
                }
                
                res = temp.toString();
                idx++;
            }
            else {
                res += s.charAt(idx);
                idx++;
            }
        }
        return res;
    }
}
