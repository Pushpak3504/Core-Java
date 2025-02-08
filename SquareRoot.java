
import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        // 16 = 4 * 4

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = sc.nextInt();
        boolean flag = false;
        for(int i=1; i<=num; i++) {
            if(i*i == num) {
                System.out.println("Square Root of Number is : "+i);
                flag = true;
                break;
            }
        }
        

        if(!flag) {
            System.out.println("The Number Doesn't Have Perfect Square");
        }
    }
}
