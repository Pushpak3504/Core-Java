
import java.util.Scanner;

public class TipRateandTotal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter subtotal");
        double subtotal = sc.nextDouble();
        System.out.println("Enter the tiprate");
        double tip = sc.nextDouble();
        double total = subtotal + subtotal * tip / 100;
        System.out.println("The tip is " +tip+" and total is " +total);
    }
}
