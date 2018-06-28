
public class ReverseInteger
{
    public int reverse(int x) {
        long sign=0;
        if(x<0)
           { 
            sign =-1;
            x = x*-1;
        }
        else
            sign= 1;
            
        long rev = 0;
        while(x!=0)
        {
            rev = (rev*10) + (x%10);
            x/=10;
            if(rev>Integer.MAX_VALUE)
                rev = 0;
            if(rev<Integer.MIN_VALUE)
                rev = 0;
        }
        return (int)(sign==-1? (rev*-1):rev);
    }
}
