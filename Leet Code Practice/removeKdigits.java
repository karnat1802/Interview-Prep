

public class removeKdigits
{
    public String removeKdigits(String num, int k) {
        //base case
        if(num.length() == k)
            return "0";
            
        int digits = num.length() - k;
        char[] ch = new char[num.length()];
        int top = 0;
        
        for(int i= 0; i<num.length(); i++)
        {
            char c = num.charAt(i);
            while(top>0 && ch[top-1]> c && k>0)
            {
                top = top - 1;
                k = k - 1;
            }
            ch[top++] = c;
        }
        
        int idx = 0;
        while(idx < digits && ch[idx]=='0')
        {
            idx++;
        }
        
        return idx == digits ? '0' : new String(ch, idx , digits - idx);
        
    }
}
