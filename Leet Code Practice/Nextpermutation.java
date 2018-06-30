import java.io.*;
import java.util.*;
public class Nextpermutation
{
   public void nextPermutation(int[] nums) {
       if(nums.length <2)
            return;
       int index = nums.length -1;
       
       while(index>0)
       {
           if(nums[index-1]<nums[index])
           {
               break;
            }
           index--; 
        }
       if(index == 0)
       {
           ReverseSort(nums,0,nums.length);
           
           return;
        }
       else{
           int j = nums.length - 1;
           int val = nums[index - 1];
           while(j>=index)
           {
              if(nums[j] > val)
                break;
              j--;  
           }
           swap(nums,index-1, j);
          
           ReverseSort(nums,index,nums.length);
           
           return;
        }
    }
    
   public void swap(int arr[],int a, int b)
   {
       int temp = arr[a];
       arr[a] = arr[b];
       arr[b] = temp;
       
    }
    
   public void ReverseSort(int arr[],int start, int end)
   {
       if(start> end)
            return;
       else
       {
       int i = start;
       int j = end-1;
       while(i<j)
       {
           swap(arr,i,j);
           i++;
           j--;
        }
       }
       
   }
}
