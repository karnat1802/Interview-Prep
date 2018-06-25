import java.util.*;
public class checkPermutation1
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
            System.out.println("They are Permutations of each other");
        }
        else
        {
            System.out.println("They are not Permutations of each other");
        }
    }
    public static boolean checkPerm(String a, String b){
        
        if(sortString(a).equals(sortString(b)))
            return true;
        else
            return false;
    }
    
    public static String sortString(String s){
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    }
}
