package javaapplication20;
import java.util.Scanner;
public class JavaApplication20 {
public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter Length : ");
        float a=obj.nextFloat();
        System.out.print("Enter Width : ");
        float b=obj.nextFloat();
        Rectangle rect = new Rectangle(a,b);            
        System.out.println("Length : " + rect.getLength());
        System.out.println("Width : " + rect.getWidth());
        System.out.println("Area : " + rect.calculateArea());
        System.out.println("Perimeter : " + rect.calculatePerimeter());
    }
public static class Rectangle {
    private float length;
    private float width;
    
    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }
    
    public float getLength() {
        return length;
    }
    
    public void setLength(float length) {
        this.length = length;
    }
    
    public float getWidth() {
        return width;
    }
    
    public void setWidth(float width) {
        this.width = width;
    }
    
    public float calculateArea() {
        return length * width;
    }
    
    public float calculatePerimeter() {
        return 2 * (length + width);
    }
    
        
    }
}
