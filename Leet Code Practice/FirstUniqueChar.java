
public class FirstUniqueChar
{
    public int firstUniqChar(String s) {
     int[] letters = new int[26];
     for(int i = 0 ; i<s.length();i++)
     {
         int val = s.charAt(i) - 'a';
         letters[val]++;
     }
     
     for(int i = 0; i<s.length();i++)
     {
         int val = s.charAt(i) - 'a';
         if(letters[val] == 1)
            return i;
     }
     return -1;
    }
}
