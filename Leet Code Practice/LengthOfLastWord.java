import java.io.*;
import java.util.*;
public class LengthOfLastWord
{
   public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();
        System.out.println("Length of the longest word is "+ lengthOfLastWord(str));
    }
   
    public static int lengthOfLastWord(String s){
        return s.trim().length() - s.trim().lastIndexOf(' ')-1;
    }
}
