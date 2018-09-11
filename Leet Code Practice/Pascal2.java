import java.util.*;
public class Pascal2
{
    public List<Integer> getRow(int rowIndex) {
        List<Integer> prev = new ArrayList<Integer>();
        for(int i = 1; i<=rowIndex+1; i++)
        {
            List<Integer> list = new ArrayList<Integer>();
            for(int j = 0; j<i; j++)
            {   
                if(j== 0)
                    list.add(1);
                else if(j == i-1)
                    list.add(1);
                else 
                    list.add(prev.get(j-1)+prev.get(j));
            }
            prev = list;
        }
        return prev;
    }
}
