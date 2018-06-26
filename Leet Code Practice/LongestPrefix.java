import java.io.*;
import java.util.*;
public class LongestPrefix
{
   public String longestCommonPrefix(String[] strs) {
     int minlength = Integer.MAX_VALUE;
     String smallest ="";
     int index;
     for (int i=0;i<strs.length;i++)
     {
         if(strs[i].length() < minlength)
         {
             smallest = strs[i];
             minlength = strs[i].length(); 
          }
     }
     
     String prefix = "";
          int count = 0;
     for(int i=0;i<smallest.length();i++)
     {
         for(int j = 0 ;j<strs.length ; j++)
         {
             if(smallest.charAt(i)!=strs[j].charAt(i))
             {
                 count = 1;
                 break;
             }
          }
          if(count ==1)
          {
            break;
            }
          prefix = prefix + smallest.charAt(i);        
     }
     return prefix;
    }
}
