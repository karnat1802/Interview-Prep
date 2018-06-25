import java.util.Scanner;
public class allCharsUnqiue2
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
       int count =  0;
       for (int i = 0 ; i<str.length(); i++)
       {
          count =  0;
          for(int j = 0 ; j<str.length(); j++)
          {
              if(str.charAt(i)==str.charAt(j))
                count++;
          
          }
          if(count>1)
            return false;
        }
        return true;
    }
}
