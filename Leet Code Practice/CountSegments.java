import java.io.*;
import java.util.*;
public class CountSegments
{
    public int countSegments(String s) {
        s = s.trim();
        if(s.length()==0)
            return 0;
        if(s.indexOf(' ' )==-1)
            return 1;
        int index  = 0;
        int count = 1;
        while(s.indexOf(' ')!=-1)
        {
            index = s.indexOf(' ');
            s = s.substring(index).trim();
            count++;
            
        }
       return count; 
    }
}
