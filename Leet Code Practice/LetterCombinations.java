import java.io.*;
import java.util.*;
public class LetterCombinations
{
    public List<String> letterCombinations(String digits) {
        LinkedList<String> ans = new LinkedList<String>();
        if(digits == null || digits.length()==0)
            return ans;
        String[] map = {"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        
        ans.add("");
        for (int i = 0; i<digits.length();i++)
        {
            int x = Character.getNumericValue(digits.charAt(i));
            while(i==ans.peek().length())
            {
                String t = ans.remove();
                for(char c: map[x].toCharArray())
                {
                    ans.add(t+c);
                }
            }
        }
        return ans;
    }
}
