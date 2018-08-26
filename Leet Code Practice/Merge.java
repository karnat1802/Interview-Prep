
public class Merge
{
    public int[] merge(int[] nums1, int m, int[] nums2, int n) {
     int i=0;
     int j=0;
     int size = 0;
     while(i<m || j <n)
     {
         if(i==m)
            nums1[size++] = nums2[j++];
         else if(j==n)
            nums1[size++] = nums1[i++];
         else if(nums1[i]<=nums2[j])
            nums1[size++] = nums1[i++];
         else
         {
             for(int k = m; k>i;k--)
                nums1[k]= nums1[k-1];
             m = m + 1;
             i = i + 1;
             nums1[size++] = nums2[j++];
         }  
     } 
     return nums1;
    }
}
