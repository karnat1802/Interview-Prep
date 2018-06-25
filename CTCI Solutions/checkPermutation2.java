import java.util.*;
public class checkPermutation2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string");
        String a = sc.nextLine();
        System.out.println("Enter the second string");
        String b = sc.nextLine();
        
         boolean bool = checkPerm(a,b);
        if(bool){
            System.out.println("They are permutations of each other");
        }
        else
        {
            System.out.println("They are not Permutations of each other");
        }
    }
    public static boolean checkPerm(String a, String b){
        
        if(a.length()!=b.length())
            return false;
            
        int[] ch = new int[128];
        
        for(int i = 0 ;i<a.length();i++)
        {
            int val = a.charAt(i);
            ch[val]++;
        }
        
        for(int j=0;j<b.length();j++)
        {
            int val = b.charAt(j);
            ch[val]--;
            if(ch[val]<0)
            {
               return false;     
            }
        }
        return true;
    }
    
    
}
