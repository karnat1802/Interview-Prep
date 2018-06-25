import java.util.Scanner;
public class allCharsUnique3
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
      int checker =  0;
      for(int i = 0; i<str.length(); i++)
      {
          int val = str.charAt(i)  - 'a';
          if((checker & (1<< val)) > 0 )
            return false;
          checker = checker | (1<<val);  
      }
      return true;
    }
}
