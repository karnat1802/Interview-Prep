import java.util.Scanner;
import java.io.*;
import java.util.*;
public class LongestSubstring
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.next();
        System.out.println("Length of the longest substring "+lengthOfLongestSubstring(str));
    }
    
    public static int lengthOfLongestSubstring(String str)
    {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        
        int j = 0;
        int max = 0;
        
        for(int i =0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(map.containsKey(ch))
            {
               j = Math.max(j,map.get(ch)+1);     
            }
            map.put(ch,i);
            max = Math.max(max,i-j+1);
        }
        return max;
    }
}
