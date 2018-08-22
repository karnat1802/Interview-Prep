

public class sortColors
{
    // instance variables - replace the example below with your own
    public void sortColors(int[] nums) {
        int one = 0;
        int two = 0;
        
        for(int i = 0; i<nums.length; i++)
        {
            if(nums[i] == 0)
            {
                nums[i] = nums[two];
                nums[two] = nums[one];
                nums[one] = 0;
                one++;
                two++;
            }
            
            else if(nums[i] == 1)
            {
                nums[i] = nums[two];
                nums[two] = 1;
                two++;
            }
            
        }
    }
}
