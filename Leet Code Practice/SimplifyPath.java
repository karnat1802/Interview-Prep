
import java.util.*;
public class SimplifyPath
{
    public String simplifyPath(String path) {
      Stack<String> stack = new Stack<String>();
      int i = 0;
      while(i<path.length())
      {
          if(path.charAt(i)=='/')
          {
              String res = "";
              i++;
              while(i<path.length() && path.charAt(i)!='/')
              {
                  res = res + path.charAt(i);
                  i++;
              }
              
              if(res.equals("..")    )
              {
                  if(!stack.isEmpty())
                    stack.pop();
              }
              
              else if (!res.equals(".")&& !res.equals(""))
              {
                  stack.push(res);  
                }
          }
      }
      
      
      if(stack.isEmpty())
      {
          return "/";
      }
      else 
      {
        String res = "";
        while(!stack.isEmpty())
        {
            res = "/" +  stack.pop() + res;
        }
        return res;
      }
    }
}
