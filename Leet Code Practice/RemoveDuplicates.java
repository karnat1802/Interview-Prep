import java.io.*;
import java.util.*;

public class RemoveDuplicates
{

    public int removeDuplicates(int[] nums) {
        int j = 0;
        for(int i =1; i<nums.length; i++)
        {
            if(nums[i]!=nums[j])
            {
                nums[++j] = nums[i];
            }
        }
        return ++j;
    }
}
