
public class RansomNote
{
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] letters = new int[26];
        for(int i=0;i<magazine.length();i++)
        {
            int val = magazine.charAt(i) - 'a';
            letters[val]++;
        }
        
        for(int i=0;i<ransomNote.length();i++){
            int val = ransomNote.charAt(i) - 'a';
            letters[val]--;
            if(letters[val] < 0)
                return false;
        }
        return true;
    }
}
