import java.io.*;
import java.util.*;
public class StringtoNumber
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.next();
        
        System.out.println("The converted string is "+myAtoi(str));
    }
    
    public static int myAtoi(String str)
    {
       int end=0;
        long sum=0;
        while(end<str.length()&&str.charAt(end)==' '){
            ++end;
        }
        int isNegative = 1;
        if(end<str.length()&&(str.charAt(end)=='-'||str.charAt(end)=='+')){
            if(str.charAt(end)=='-'){
            isNegative =-1;
            }
            ++end;
        }
        
        
	for(int i=end; i<str.length();++i){
			char cur = str.charAt(i);
			if(!Character.isDigit(cur))break;
			sum*=10;
			sum+=((long)cur-'0');
			if(sum>(long)Integer.MAX_VALUE&& isNegative==-1)return Integer.MIN_VALUE;
			else if(sum>(long)Integer.MAX_VALUE) return Integer.MAX_VALUE;
	}
	sum*=isNegative;
	return (int)sum;
    }

}
