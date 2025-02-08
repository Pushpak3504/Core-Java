import java.util.Scanner;

public class FindSumOfDigitUsingLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = sc.nextInt();
        int sum = 0;

        while(num > 0) {
            int rem = num % 10;
            sum += rem;
            num /= 10;
        }

        System.out.println("The Sum Of Digit is : "+sum);
    }
}
