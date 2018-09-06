
import java.util.*;
public class Pascal
{
    public List<List<Integer>> generate(int numRows) {
        if(numRows == 0)
            return new ArrayList<List<Integer>>();
        
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        
        for(int i = 1; i<=numRows; i++)
        {
            List<Integer> res = new ArrayList<Integer>();
            for(int j=0; j<i; j++)
            {
                if(j==0 || j ==i-1)
                    res.add(1);
                else 
                    res.add(list.get(i-2).get(j) + list.get(i-2).get(j-1));
            }
            list.add(res);
        }
        return list;    
    }
}
