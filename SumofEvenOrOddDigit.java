
import java.util.Scanner;

public class SumofEvenOrOddDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = sc.nextInt();
        int evenSum = 0;
        int oddSum = 0;

        while(num > 0) {
            int rem = num % 10;

            if(rem % 2 == 0) {
                evenSum += rem;
            }
            else {
                oddSum += rem;
            }

            num /= 10;

        }

        System.out.println("The Even Digits Sum In Number is : "+evenSum);
        System.out.println("The Odd Digits Sum In Number is : "+oddSum);
    }
}
