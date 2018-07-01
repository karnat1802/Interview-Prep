import java.io.*;
import java.util.*;

public class SearchRange
{
   public int[] searchRange(int[] nums, int target) {
       int index = firstGreaterEqual(nums,target);
       
       if (index == nums.length || nums[index]!= target)
            return new int[]{-1,-1};
            
       else{
           System.out.println(Arrays.toString(new int[]{index, firstGreaterEqual(nums,target+1)-1}));
           return new int[]{index, firstGreaterEqual(nums,target+1)-1};
        }
    }
    
    
   public int  firstGreaterEqual(int arr[], int target)
   {
       int low =  0;
       int high = arr.length;
       
       while(low < high)
       {
           int mid = (low + high)/2;
           if (arr[mid] < target)
           {
               low = mid + 1;
           }
           
           else{
               high = mid;
            }
           
        }
       return low; 
    }
}
