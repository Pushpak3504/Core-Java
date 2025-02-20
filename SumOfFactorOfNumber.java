
import java.util.Scanner;

public class SumOfFactorOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number : ");
        int num = sc.nextInt();
        int sum = 0;
        for(int i=1; i<=num; i++) {
            if(num % i == 0) {
                sum += i;
            }
        }
        System.out.println("The Sum of Factor Of Number is : "+sum);
    }
}
