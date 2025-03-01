import java.util.Scanner;

public class DecimalToBinary1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        String bin = sc.next();
        int op = Integer.parseInt(bin, 2);
        System.out.println(op);
    }
}
