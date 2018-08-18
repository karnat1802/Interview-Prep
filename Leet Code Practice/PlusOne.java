
/**
 * Write a description of class PlusOne here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PlusOne
{
    public int[] plusOne(int[] digits) {
        int carry = 0;
        int sum = 0;
       for(int i = digits.length - 1; i>=0; i--)
       {
           if( i == digits.length - 1)
           {
                sum = digits[i] + 1 + carry;
                digits[i] = sum % 10;
                carry  = sum/ 10;
           }
           else
           {
                sum = digits[i] + carry;
                digits[i] = sum % 10;
                carry  = sum/ 10;
           }
       }
       
       if(carry == 1)
       {
           int[] arr = new int[digits.length+1];
           
           for(int i=digits.length; i>=1; i--)
           {
               arr[i] = digits[i-1];
            }
            
           arr[0] = 1; 
           return arr;
        }
       else{
           return digits;
        }
    }
}
