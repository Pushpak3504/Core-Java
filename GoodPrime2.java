
import java.util.Scanner;

public class GoodPrime2 {
    public static boolean isPrime(int n) {
        if(n<2) {
            return false;
        }
        for(int i=2; i<n; i++) {
            if(n%i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isGoodPrime(int num) {
        while (num > 0) {
            if (!isPrime(num)) {
                return false; 
            }
            num /= 10; 
        }
        return true;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Range : ");
        int range = sc.nextInt();
        int cnt = 0;

        for(int i=2; i<range; i++) {
            if(isGoodPrime(i)) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
