import java.util.Scanner;
public class LongestPalindromeSubstring
{
    private int lo = 0;
    private int maxlen = 0;
    public  void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.next();
        longestPalindrome(str);
    }
    
    public  void longestPalindrome(String str)
    {
       if(str.length()==1)
       {
           System.out.println("The longest Palindrome substring is "+ str);
        }
       for(int i = 0; i<str.length()-1 ; i++)
       {
           extendPalindrome(str,i,i);
           extendPalindrome(str,i,i+1);
        }
       System.out.println("The longest Palindrome substring is "+ str.substring(lo,lo+maxlen));
    }
    
    public void  extendPalindrome(String s, int j, int k)
    {
        System.out.println("j = " +j+" Character at j = "+s.charAt(j));
        System.out.println("k = " +k+" Character at k = "+s.charAt(k));

        while(j>=0 && k<s.length() && s.charAt(j)==s.charAt(k))
        {
            j--;
            k++;
        }
        if(maxlen < k-j-1)
        {
            lo = j+1;
            maxlen = k-j-1;
            System.out.println("The longest Palindrome substring for now is "+ s.substring(lo,lo+maxlen));
        }
    }
}
