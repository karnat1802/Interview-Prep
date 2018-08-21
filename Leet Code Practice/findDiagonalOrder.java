

public class findDiagonalOrder
{
    public int[] findDiagonalOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0 )
        {
            return new int[0];
        }
        
        
        int m = matrix.length;
        int n = matrix[0].length;
        
        int[][] dirs = {{-1,1},{1,-1}};
        int d = 0;
        
        int[] res = new int [m*n];
        int row = 0;
        int col = 0;
        for(int i = 0; i<m*n; i++ )
        {
            res[i] = matrix[row][col];
            
            row += dirs[d][0];
            col += dirs[d][1];
            
            if(row>=m)
            {
                col += 2;
                row = m - 1;
                d = 1-d;
            }
            if(col>=n)
            {
                row += 2;
                col = n-1;
                d = 1-d;
            }
            if(row<0)
            {
                row = 0;
                d = 1-d;
            }
            if(col<0)
            {
                col = 0;
                d = 1-d;
            }
        }
        return res;
    }
}
