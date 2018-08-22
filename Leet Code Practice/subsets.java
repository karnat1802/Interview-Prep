
import java.util.*;
public class subsets
{
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(nums, new ArrayList<Integer>(), 0, list);
        return list;
    }
    
    public void backtrack(int[] nums, List<Integer> templist, int start, List<List<Integer>> list)
    {
        list.add(new ArrayList<Integer>(templist));
        for(int i = start; i<nums.length; i++)
        {
            templist.add(nums[i]);
            backtrack(nums, templist, i+1, list);
            templist.remove(templist.size()-1);
        }
        
    }
}
