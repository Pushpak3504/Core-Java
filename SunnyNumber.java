
import java.util.Scanner;

public class SunnyNumber {
    public static void main(String[] args) {
        // 16 = 4 * 4

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = sc.nextInt();
        int newNum = num + 1;
        boolean flag = false;
        for(int i=1; i<=newNum; i++) {
            if(i*i == newNum) {
                flag = true;
                break;
            }
        }
        

        if(flag) {
            System.out.println(num+" is Sunny Number");
        }
        else{
            System.out.println(num+" is Not Sunny Number");
        }
    }
}
