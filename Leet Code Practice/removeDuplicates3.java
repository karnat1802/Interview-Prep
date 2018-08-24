
public class removeDuplicates3
{
    public int removeDuplicates(int[] nums) {
        
        int count = 1;
        int size = 1;
        for(int i = 1; i<nums.length; i++)
        {
            if(nums[i] == nums[i-1] && count<2)
                {
                    nums[size++]=nums[i];
                    count++;
                }
                
            else if(nums[i-1]!=nums[i])
                {
                    nums[size++] = nums[i];
                    count = 1;
                }
            else{
                count++;
            }
                
        }
        return size;
    }
}
