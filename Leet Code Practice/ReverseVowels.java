
public class ReverseVowels
{
    public String reverseVowels(String s) {
        String nstr ="";
        for(int i = 0; i<s.length(); i++)
        {
            char ch= s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            {
                nstr += ch;
            }
        }
        
        if(nstr.length()==0)
            return s;
            
        char[] c = nstr.toCharArray();
        int index = nstr.length()-1;
        String str = "";
        for (int i=0; i <s.length(); i++)
        {
            char ch = s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            {
                str = str + c[index];
                index--;
            }
            else
            {
                str = str + ch;
            }
        }
        return str;
    }
}
