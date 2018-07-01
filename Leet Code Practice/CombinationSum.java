import java.io.*;
import java.util.*;
public class CombinationSum
{
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        Arrays.sort(candidates);
        backTrack(list, new ArrayList<Integer>(),candidates, target, 0);
        for(int i = 0; i<list.size();i++)
        {
            System.out.println(Arrays.toString(list.get(i).toArray()));
        }
        return list;
    }
    
    public void backTrack(List<List<Integer>> list, ArrayList<Integer> templist, int nums[], int remains, int start)
    {
        if(remains < 0)
            return;
        else if(remains == 0)
            {
            list.add(new ArrayList<Integer>(templist));
            return;
        }
        else{
            for(int i = start; i<nums.length; i++)
            {
                templist.add(nums[i]);
                backTrack(list, templist, nums,remains - nums[i] ,i);
                templist.remove(templist.size() - 1);
            }
        }
    }
}
