
public class ValidPalindrome
{
    public boolean isPalindrome(String s) {
     if(s.length()==0)
          return true;
      s= s.toLowerCase();
     int i = 0;
     int j = s.length()-1;
     while(i!=j && i<j)
     {
       if(!(Character.isDigit(s.charAt(j)) || Character.isLetter(s.charAt(j))))
            j--;
       else if(!(Character.isDigit(s.charAt(i)) || Character.isLetter(s.charAt(i))))  
            i++;
       else if(s.charAt(i) != s.charAt(j))
            return false;
       else if(s.charAt(i) == s.charAt(j))
       {  
           j--;
            i++;
       }
     }
    return true;

}
}
