package Project1Team3.Project4Team3;
public class Project4Team3 {
    public static void main(String[] args) {
        int num=5;
        double result=0.0;
        System.out.println("The harmonic series is");
        while(num>0){
            result=result+(double)1/num;
            num--;
            System.out.print(result+",");
        }
    }
    
}
