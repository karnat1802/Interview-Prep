import java.io.*;
import java.util.*;
public class BinarySearchRecursion
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements of the array");
        for (int i=0;i<size;i++)
        {
            arr[i]= sc.nextInt();
        }
        
        System.out.println("Enter the element to search");
        int key = sc.nextInt();
        int min = 0;
        int max = size - 1;
        
        boolean x = binarySearch(arr,key,min,max);
        if(x)
        {
            System.out.println("Value found");
        }
        else
        {
            System.out.println("Value not found");
        }
    
    }
    
    public static boolean binarySearch(int arr[],int key, int min, int max)
    {
        if(max<min)
        {
            return false;
        }
        else{
            int mid = (min+max)/2;
            if(arr[mid]<key)
            {
                return binarySearch(arr,key,mid+1,max);
            }
            else if(arr[mid]>key)
            {
                return binarySearch(arr,key,min,mid-1);
            }
            else if(arr[mid]==key)
            {
                return true;
            }
        }
        return false;
    }
}
