package javaapplication9;
import java.util.*;
public class StringIndexOutOfBoundException61 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        String str;
        int key;
        char at;
        try
        {
            System.out.print("Enter the String: ");
            str=obj.next();
            System.out.print("Enter the index value of the position you need to access: ");
            key=obj.nextInt();
            at=str.charAt(key);
            System.out.println("The value at index "+key+" is: "+at);
            
        }
        catch(StringIndexOutOfBoundsException e)
        {
            System.out.println("\n"+e);
        }                  
    }    
}
