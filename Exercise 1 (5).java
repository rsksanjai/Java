package Project1Team3.Project5Team3;
import java.util.Scanner;
public class Project5Team3 {
    private static final String[] onesPlace = {
        "", "One", "Two", "Three", "Four", "Five",
        "Six", "Seven", "Eight", "Nine"
    };

    private static final String[] teens = {
        "", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen",
        "Sixteen", "Seventeen", "Eighteen", "Nineteen"
    };

    private static final String[] tensPlace = {
        "", "Ten", "Twenty", "Thirty", "Forty", "Fifty",
        "Sixty", "Seventy", "Eighty", "Ninety"
    };
    private static String convertTwoDigitNumber(int num) {
        if (num == 0) {
            return "";
        } else if (num < 10) {
            return onesPlace[num];
        } else if (num < 20) {
            return teens[num - 10];
        } else {
            return tensPlace[num / 10] + " " + onesPlace[num % 10];
        }
    }
    private static String convertThreeDigitNumber(int num) {
        if (num == 0) {
            return "";
        } else {
            if (num % 100 == 0) {
                return onesPlace[num / 100] + " Hundred";
            } else {
                return onesPlace[num / 100] + " Hundred and " + convertTwoDigitNumber(num % 100);
            }
        }
    }
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a digit (0-999): ");
            int number = scanner.nextInt();
            if (number < 0 || number > 999) {
                System.out.println("Number out of range");
            } else if (number == 0) {
                System.out.println("Zero");
            } else {
                String result = "";
                if (number / 100 > 0) {
                    result = convertThreeDigitNumber(number);
                } else {
                    result = convertTwoDigitNumber(number);
                }
                System.out.println("Number in words: " + result);
            }
        }
    }
    
}
