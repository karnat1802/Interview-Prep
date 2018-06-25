
import java.util.Scanner;
public class checkPermutation
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter a string");
        String a = sc.nextLine();
        System.out.println("Plase Enter next string");
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
        
        if(a.length()!=b.length())
            return false;
        else{    
            for(int i=0; i<a.length();i++)
            {
                int count = 0;
                for(int j=0;j<b.length();j++)
                {
                    if(a.charAt(i)==b.charAt(j))
                    {
                        count++;
                    }
                }
                if(count !=1)
                {
                    return false;
                }
            }
        }
        return true;
    } 
}
