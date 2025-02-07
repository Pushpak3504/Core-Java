
import java.util.Scanner;

public class SumOfDigitUsingLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num= sc.nextInt();
        int dup = num;
        int sum = 0;
        while(num > 0) {
            int rem = num % 10;
            sum += rem;
            num /= 10;
        }
        System.out.println("Sum of the Digit is : "+sum);
        System.out.println("Original Number was : "+dup);
    }
}
