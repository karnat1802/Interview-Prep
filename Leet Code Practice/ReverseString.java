import java.io.*;
import java.util.*;
public class ReverseString
{
    public String reverseString(String s) {
       if(s.length()<=1)
        return s;
        
       return reverseString(s.substring(s.length()/2,s.length())) + reverseString(s.substring(0,s.length()/2));
    }
}
