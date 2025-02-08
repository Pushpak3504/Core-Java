
import java.util.Scanner;

public class ProductOfDigitInNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = sc.nextInt();
        int op = 1;
        
        while(num > 0) {
            int rem = num % 10;
            op *= rem;
            num /= 10;
        }

        System.out.println("The Product Of Digits in Number is : "+op);
    }
}
