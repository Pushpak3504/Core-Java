import java.util.Scanner;

class BinaryToDecimal {
    public static void main(String[] args) {
        System.out.print("Enter the number : ");
        int n = new Scanner(System.in).nextInt();
        int sum = 0;
        int base = 1;
        while(n > 0) {
            int rem = n%10;
            sum += rem*base;
            base *= 2;
            n/=10;
        }
        System.out.println(sum);
    }
}
