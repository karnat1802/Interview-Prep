import java.util.Scanner;
import java.io.*;
import java.util.*;


 class HashTable{
    private int maxsize;
    private int currentsize;
    private String keys[];
    private String vals[];
    
    /* Constructor for hash table */
    public HashTable(int capacity){
        currentsize = 0;
        maxsize = capacity;
        keys = new String[maxsize];
        vals = new String[maxsize];
    }
    public int getSize(){
        return currentsize;
    }
    public boolean isFull(){
        return (currentsize == maxsize);
    }
    public boolean isEmpty(){
        return (currentsize == 0);
    }
    
    
    public int hash(String key){
        // System.out.print(key.hashCode());
        return Math.abs(key.hashCode()%maxsize) ;
    }
    public void insert(String key, String value){
        int temp = hash(key);
        int i = temp;
        // System.out.print(i);
        do{
            if(keys[i]==null){
                keys[i] = key;
                vals[i] = value;
                currentsize++;
                return;
            }
            if(keys[i].equals(key))
            {
                vals[i] = value;
                return;
            }
            i = (i+1) % maxsize;
        }while(i!=temp);
        
    }
    
    public void remove(String key){
        int i = hash(key);
        if(get(key)==null)
        {
            return;
        }
        while (!keys[i].equals(key))
        {
            i=(i+1)%maxsize;
        }
        keys[i] = null;
        vals[i] = null;
        
        /* Rehash all the remaining values */
        for( i = (i+1)%maxsize; keys[i]!=null ; i=(i+1)%maxsize)
        {
            String temp1 = keys[i];
            String temp2 = vals[i];
            keys[i] = null;
            vals[i] = null;
            insert(temp1,temp2);
        }
        currentsize--;
        
    }
    
    public String get(String key){
        int i = hash(key);
        while(keys[i]!=null){
            if(keys[i].equals(key))
                return vals[i];
            i = (i+1)%maxsize;    
        }
        return null;
    }
    public void display(){
        System.out.println("The Hash table is as follows");
        
        for(int i=0;i<maxsize;i++){
                if(keys[i]!=null)
                {
                    System.out.println(keys[i]+" "+vals[i]);
                }
        }
        System.out.println();
    }
}

public class HashtableTester
{
    public static void main(String args[])
    {
        HashTable ht = new HashTable(100);
        ht.display();
        ht.insert("Ronaldo","Real Madrid" );
        ht.insert("Neymar","Barcelona" );
        ht.insert("Messi","Barcelona" );
        ht.insert("Bale","Real Madrid" );
        ht.insert("Lukaku","Man Utd" );
        ht.display();
        
        
        ht.insert("Neymar","PSG" );
        ht.display();
        
        System.out.println("Is the hash table full ? "+ht.isFull());
        System.out.println("The current size of the hash table is "+ht.getSize());
        
        System.out.println("Removing a few elements");
        ht.remove("Messi");
        ht.remove("Bale");
        System.out.println();
        System.out.println("Showing the remaing elements");
        
        ht.display();
        
    }
}
