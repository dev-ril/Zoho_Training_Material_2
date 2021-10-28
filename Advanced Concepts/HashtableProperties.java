//  6. What is the difference between a Hashtable and Properties? (Write a program as an example!)

import java.util.*;  
import java.io.*;  

public class HashtableProperties 
{  
    public static void main(String[] args) throws Exception
    {  
        Hashtable<Integer,String> h = new Hashtable<Integer,String>(); //Can have any type key-value pair with non-null keys and values..
  
        h.put(100,"Mohamed");  
        h.put(102,"Rilwan");  
        h.put(101,"Hussain");    
  
        for(Map.Entry m:h.entrySet())
        {  
            System.out.println(m.getKey()+" "+m.getValue());  
        }
       
        Properties p = new Properties();  //Can only have <String,String> key-value pairs with non-null values..

        p.setProperty("firstname","Rilwan");
        p.setProperty("lastname","Hussain");
      
        System.out.println(p.getProperty("firstname"));  
        System.out.println(p.getProperty("lastname"));  
    }     
}  