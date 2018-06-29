import java.io.*;
import java.util.*;
import java.lang.*;

public class MaxArea
{
    public int maxArea(int[] height) {
        int left =  0;
        int right = height.length - 1;
        int maxAr =  0;
        
        while(left < right){
            int area = Math.min(height[left],height[right]) * (right-left);
            maxAr = Math.max(maxAr,area);
            if(height[left] < height[right])
            {
                left++;
            }
            else{
                right--;
            }
            
        }
        return maxAr;
        
    }
}
