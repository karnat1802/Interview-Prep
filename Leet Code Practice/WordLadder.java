import java.io.*;
import java.util.*; 
public class WordLadder
{
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        boolean present = false;
        for(int i = 0; i< wordList.size(); i++)
        {
            if(endWord.equals(wordList.get(i)))
            {   
                present = true;
                break;
            }
        }
        
        if(present == false)
            return 0;
        
            
            
        Set<String> wordDict = new HashSet<String>(wordList);    
        Set<String> reached = new HashSet<String>();
        reached.add(beginWord);
        
        int distance = 1;
        
        while(!reached.contains(endWord))
        {
            Set<String> toAdd = new HashSet<String>();
            for(String each: reached)
            {
                for(int i = 0; i< each.length(); i++)
                {
                    char[] chars = each.toCharArray();
                    for(char c = 'a'; c<= 'z'; c++)
                    {
                        chars[i] = c;
                        String word = new String(chars);
                        
                        if(wordDict.contains(chars))
                        {
                            toAdd.add(word);
                            wordDict.remove(word);
                        }
                    }
                    
                }
            }
            distance++;
            if(toAdd.size()==0)
                return 0;
            reached = toAdd;
        }
        return distance;
    }
}
