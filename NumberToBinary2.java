import java.util.Scanner;

public class NumberToBinary2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        String bin = Integer.toBinaryString(num);
        System.out.println(bin);
    }
}
