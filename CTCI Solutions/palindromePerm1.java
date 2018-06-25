import java.util.Scanner;
public class palindromePerm1
{
   public static void main(String args[])
   {
       Scanner sc = new Scanner (System.in);
       System.out.println("Enter the string to check for Palindrome Permutation");
       String str = sc.nextLine();
       str = str.toLowerCase();
       
       boolean bool = checkPerm(str);
       if(bool)
       {
           System.out.println("String has Palindrome permutation");
        }
        else
        {
            System.out.println("String does not have Palindrome permutation");
        }
    }
    
    
    public static boolean checkPerm(String str)
    {
        int bitvector = createBitVector(str);
        return (bitvector ==0) || ((bitvector & (bitvector -1))==0);
        
    }
    public static int createBitVector(String str)
    {
        int bitvector = 0;
        for (int i =0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(Character.isLetter(ch))
            {
                int val = ch;
                int val1 = (int) 'a';
                val = val - val1;
                bitvector = bitvector ^ (1<<val);
            }
        }
        return bitvector;
    }
    
}
