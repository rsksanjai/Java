package javaapplication9;
import java.util.Scanner;
public class ArithmeticException61
{
public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int a,b;
        try
        {
            System.out.print("\nEnter the value of A: ");
            a=obj.nextInt();
            System.out.print("Enter the value of B: ");
            b=obj.nextInt();
            int div=a/b;
            System.out.println("The Division of "+a+" and "+b+" is: "+div);
        }
        catch(ArithmeticException e)
        {
            System.out.println(""+e);
        }
    }
}
