import java.io.*;
import java.util.*;
public class RotatedSorted
{
   public int search(int[] nums, int target) {
       if(nums.length == 0)
            return -1;
       if(nums.length == 1 && nums[0]==target)
            return 0;
       int index = -1;
       for(int i = 0; i<nums.length-1; i++)
       {
           if(nums[i] > nums[i+1])
           {  
               index = i;
               break;
           }
        }
        
        if(index == -1)
            return binarySearch(nums,target,0,nums.length-1);
        
       if(target<nums[0] && target > nums[nums.length - 1])
            return -1;
       if(target<nums[0])
            return binarySearch(nums,target,index+1,nums.length-1);
       if (target>=nums[0])
            return binarySearch(nums,target,0,index);
       
            
       return -1;     
    }
    public int binarySearch(int arr[],int key, int min, int max)
    {
        if(max<min)
        {
            return -1;
        }
        else{
            int mid = (min+max)/2;
            if(arr[mid]<key)
            {
                return binarySearch(arr,key,mid+1,max);
            }
            else if(arr[mid]>key)
            {
                return binarySearch(arr,key,min,mid-1);
            }
            else if(arr[mid]==key)
            {
                return mid;
            }
        }
        return -1;
    }
}
