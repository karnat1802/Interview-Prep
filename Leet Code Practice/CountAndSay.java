import java.io.*;
import java.util.*;

public class CountAndSay
{
    public static void main(String args[])
    {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter number"); 
//         int n  = sc.nextInt();
        for(int i =  1; i <10;i++)
        {
            System.out.println(i+" "+countAndSay(i));
        }
        
    }
    
    public static String countAndSay(int n) {
        String nstr="";
        if(n==1)
        {
            return "1";
        }
        else
        {
            String str ="1";
             
            for(int i = 1; i<= n-1 ;i++)
            {
                
                int count = 1;
                nstr = "";
                for(int j = 0; j<str.length(); j++)
                {
                    char ch = str.charAt(j);
                    if(j+1 < str.length() && str.charAt(j)==str.charAt(j+1))
                    {
                        count++;
                    }
                    else{
                        nstr = nstr + Integer.toString(count)+ch;
                        count = 1; 
                    }
                }
                str = nstr;
                
            }
            
        }
        return nstr;
    }
}
