import java.util.Scanner;

public class SumOfEvenDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = sc.nextInt();
        int dup = num;

        int sum = 0;
        while(num > 0) {
            int rem = num % 10;
            if(rem % 2 == 0) {
                sum += rem;
            }
            num /=10;
        }
        System.out.println("Sum of Even Numbers in the given Number is : "+sum);
        System.out.println("The Original Number was : "+dup);
    }
}
