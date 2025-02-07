
import java.util.Scanner;

public class ReversingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any 4 Digit Number");

        int num = sc.nextInt();
        int dup = num;
        int rev = 0;
        int rem = num % 10;
        rev = rev * 10 + rem;
        num = num / 10;

        rem = num % 10;
        rev = rev * 10 + rem;
        num = num / 10;

        rem = num % 10;
        rev = rev * 10 + rem;
        num = num / 10;

        rem = num % 10;
        rev = rev * 10 + rem;
        System.out.println(dup+" : "+rev);
    }
}
