import java.util.Scanner;
public class URLify
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to URLify");
        String str = sc.nextLine();
        
        System.out.println("The String after URLifying is "+ urlify(str));
    }
    
    public static String urlify(String st){
        String nstr = "";
        char ch;
        for(int i=0;i<st.length();i++)
        {
            ch = st.charAt(i);
            if(ch==(' '))
            {
                nstr = nstr +"%20";
            }
            else
            {
                nstr = nstr + ch;
            }
        }
        return nstr;
    }
}
