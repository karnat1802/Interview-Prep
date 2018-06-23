import java.io.*;
import java.util.*;

public class BinarySearch
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of the array");
        int size = sc.nextInt();
        System.out.println("Enter elements in the array in ascending order");
        int arr[] = new int[size];
        for (int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Enter the value to search");
        int key = sc.nextInt();
        
        boolean x = binarySearch(arr,key);
        if(x)
        {
            System.out.println("Value found");
        }
        else{
            System.out.println("Value not found");
        }
        
    }
    
    public static boolean binarySearch(int arr[], int key){
        int max = arr.length;
        int min = 0;
        int mid;
        while(min<max)
        {
            mid = (min+max)/2;
            if(arr[mid]<key)
            {
                min = mid+1;
            }
            else if(arr[mid]>key){
                max = mid - 1;
            }
            else if(arr[mid]==key)
            {
                return true;
            }
            
        }
        return false;
    }
}
