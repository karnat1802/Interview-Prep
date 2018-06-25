
import java.util.Scanner;
public class palindromePerm
{
   public static void main(String args[])
   {
       Scanner sc = new Scanner (System.in);
       System.out.println("Enter the string to check for Palindrome Permutation");
       String str = sc.nextLine();
       str = str.toLowerCase();
       int[] table = getHashTable(str);
       boolean bool = checkPerm(table);
       if(bool)
       {
           System.out.println("String has Palindrome permutation");
        }
        else
        {
            System.out.println("String does not have Palindrome permutation");
        }
    }
    public static int[] getHashTable(String s)
    {
        int[] table = new int[26];
        
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(Character.isLetter(ch))
            {
                int val = ch;
                int val1 = (int)'a';
                val = val - val1;
                table[val]++;
            }
        }
        return table;
    }
    public static boolean checkPerm(int[] arr)
    {
        
        boolean check = false;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0 && arr[i]%2!=0)
            {
                if(check)
                    return false;
                check = true;    
            }
        }
        return true;
    }
    
}
