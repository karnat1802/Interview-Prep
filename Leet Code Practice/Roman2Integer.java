import java.util.Scanner;
public class Roman2Integer
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string");
        String str = sc.next();
        System.out.println("Integer value of the Roman number is "+ findSum(str));
    }
    
    public static int findSum(String str)
    {
        int sum = 0;
        for(int i = 0 ;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(ch=='I')
                sum += 1;
            else if(ch=='V')
                sum += 5; 
            else if(ch=='X')
                sum += 10;
            else if(ch=='L')
                sum += 50;
            else if(ch=='C')
                sum += 100;
            else if(ch=='D')
                sum += 500;
            else if(ch=='M')
                sum += 1000;     
        }
        
        if(str.indexOf("IV")!=-1)
            sum = sum -2 ;
        if(str.indexOf("XL")!=-1)
            sum = sum -20 ;
        if(str.indexOf("CD")!=-1)
            sum = sum -200 ;
        if(str.indexOf("IX")!=-1)
            sum = sum -2 ;
        if(str.indexOf("XC")!=-1)
            sum = sum -20 ;
        if(str.indexOf("CM")!=-1)
            sum = sum -200 ;
       
        return sum;     
    }
}
