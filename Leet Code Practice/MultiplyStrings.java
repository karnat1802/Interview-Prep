import java.io.*;
import java.util.*;
public class MultiplyStrings
{
    public String multiply(String num1, String num2) {
        int[] pos = new int[num1.length()+num2.length()];
        for(int i = num1.length()-1; i>=0; i--)
        {
            for(int j = num2.length()-1 ; j>=0; j--)
            {
                int mul = Character.getNumericValue(num1.charAt(i)) * Character.getNumericValue(num2.charAt(j));
                int sum = mul + pos[i+j+1];
                
                pos[i+j] += (sum/10);
                pos[i+j+1] = sum % 10;
            }
        }
        
//             StringBuilder sb = new StringBuilder();
//             for(int p: pos)
//             {
//                 if(!(sb.length()==0 && p ==0))
//                     sb.append(p);
//             }
//             
//             return sb.length()==0 ? "0" : sb.toString(); 
        String nstr ="";
        for (int i = 0 ; i<pos.length; i++)
        {
            if (!(nstr.length()==0 && pos[i]==0))
            {
                nstr = nstr + Integer.toString(pos[i]);
            }
        }
        return nstr.length()==0 ? "0" : nstr ;
    }
}
