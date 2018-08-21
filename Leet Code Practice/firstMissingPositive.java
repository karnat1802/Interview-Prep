
public class firstMissingPositive
{
    public int firstMissingPositive(int[] nums) {
        int k = Partition(nums) + 1;
        int first_index = k;
        
        for(int i = 0; i<k ; i++)
        {
            int temp = Math.abs(nums[i]);
            if(temp <= k)
                nums[temp - 1] = (nums[temp-1]>0) ? -nums[temp -1 ] : nums[temp -1];   
        }
        
        for(int i = 0; i<k; i++)
        {
            if(nums[i] > 0)
            {
                first_index = i;
                break;
            }
        }
        
        return first_index + 1;
    }
    
    
    public int Partition(int[] nums)
    {
        int q = -1;
        
        for(int i = 0; i<nums.length; i++)
        {
            if(nums[i]>0)
            {
                q++;
                swap(nums, q, i);
            }
        }
        return q;
    }
    
    
    public  void swap(int[] nums, int i, int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
