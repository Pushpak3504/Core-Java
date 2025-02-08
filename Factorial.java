
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE NUMBER : ");
        int num = sc.nextInt();
        int op = 1;
        for(int i=1; i<=num; i++) {
            op *= i;
        }
        System.out.println("THE FACTORIAL OF "+num+" IS : "+op);
    }
}
