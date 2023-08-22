package Project1Team3.Project2Team3;
import java.util.Scanner;
public class Project2Team3 {
    public static void main(String[] args) {
        int a, b, smallest;   
Scanner sc = new Scanner(System.in);    
System.out.println("Enter the first number:");  
a = sc.nextInt();  
System.out.println("Enter the second number:");  
b = sc.nextInt();  
if(a<b){
    System.out.print("Minimum is " + a);
}
else
{
    System.out.println("Minimun is " + b);
}
    }
    
}
