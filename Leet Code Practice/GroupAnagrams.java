import java.io.*;
import java.util.*;

public class GroupAnagrams
{
    public List<List<String>> groupAnagrams(String[] strs) {
        //Deal with edge cases
        if(strs==null || strs.length == 0 )
            return new ArrayList<List<String>>();
        Map<String, List<String>> map = new HashMap <String, List<String>>();
        for(String s: strs)
        {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String str = String.valueOf(c);
            if(!map.containsKey(str))
                map.put(str,new ArrayList<String>());
            map.get(str).add(s);
        }
        return new ArrayList<List<String>>(map.values());
    }
    
}
