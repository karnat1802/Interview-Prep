import java.util.Scanner;
public class allCharsUnique
{
   public static void main(String args[])
   {
    System.out.println("Enter the String to check for Unique chars");
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    
    boolean bool = checkUniqueChars(str);
    if(bool){
        System.out.println("All the characters are unique");
    }
    else{
        System.out.println("Not all Chars are Unique");
    }
   }
   
   public static boolean checkUniqueChars(String str){
       boolean chars[]= new boolean[256];
       for(int i  = 0 ; i<str.length();i++)
       {
          int val =  str.charAt(i);
          if(chars[val])
            return false;
          else
            chars[val] = true;
        }
       return true;
    }
}
