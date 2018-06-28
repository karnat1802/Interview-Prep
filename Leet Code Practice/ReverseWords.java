import java.io.*;
import java.util.*;

public class ReverseWords
{
    public String reverseWords(String s) {
        if(s==null)
            return null;
        s = s.trim();
        if(s.indexOf(' ')==-1)
            return s;
        ArrayList<String> list = new ArrayList<String>();
        int index = 0;
        int start = 0;
        while(s.indexOf(' ')!=-1)
        {
            index = s.indexOf(' ');
            String word = s.substring(0,index);
            list.add(word);
            s = s.substring(index);
            s = s.trim();
        }
        list.add(s);
    
    String nstr = "";
    for(int i=list.size()-1; i>=0; i--)
        nstr = nstr + list.get(i) + " ";
    return nstr.trim(); 
}
}
