
import java.util.Scanner;

// 24/01/2015

public class HiHelloNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        // String op = ((num % 2 == 0) || (num % 5 == 0))?((num%2 == 0)?("Hitwo"):("hifive")):("");
        String op = (num % 2 == 0 || num % 5 == 0)?((num%2 == 0 && num % 5 == 0)?("HiTwoFive"):((num%5 == 0)?("HiFIve"):("HiTwo"))):("");
        System.out.println(op);
    }
}
