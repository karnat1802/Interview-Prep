
public class RepeatedSubstring
{
    public boolean repeatedSubstringPattern(String s) {
       for(int i = s.length()/2; i>=1 ; i--)
       {
           if(s.length()%i == 0)
           {
               int m = s.length()/i;
               String st = s.substring(0,i);
               StringBuilder sb = new StringBuilder();
               
               for(int j=0;j<m;j++)
               {
                   sb.append(st);
                }
               
               if((sb.toString()).equals(s))
                    return true;
            }
           
       }
       return false;
    }   
}
