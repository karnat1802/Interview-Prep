

public class SearchMatrix
{
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        
        for(int i = 0; i<m-1; i++)
        {
            if(target>=matrix[i][0] && target<matrix[i+1][0])
                return binarySearch(i,n,target, matrix);
        }
        if(target>=matrix[m-1][0] && target<matrix[m-1][n-1])
            return binarySearch(m-1,n,target,matrix);
        return false;
    }
    
    
    public boolean binarySearch(int i, int n, int target, int[][]matrix)
    {
        int low = 0;
        int high = n-1;
        
        while(low <=high)
        {
            int mid = (low + (high-low)) / 2;
            if(target==matrix[i][mid])
                return true;
            if(target>matrix[i][mid])
                low = mid + 1;
            else if(target< matrix[i][mid])
                high = mid - 1;
                
            
        }
        return false;
    }
}
