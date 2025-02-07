
import java.util.Scanner;

public class Whether {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num 1 : ");
        double num1 = sc.nextDouble();
        System.out.print("Enter num 2 : ");
        double num2 = sc.nextDouble();
        System.out.print("Enter The Operand : ");
        char op = sc.next().charAt(0);

        double out = (op == '+')?(num1 + num2):
                    ((op == '-')?(num1 - num2):
                    ((op == '*')?(num1 * num2):
                    ((op == '/')?(num1 / num2):
                    ((op == '%')?(num1 % num2):(0)))));

        System.out.println(num1 + " " + op + " " + num2 +" = " +out);
    }
}
