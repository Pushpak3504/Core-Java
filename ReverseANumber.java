import java.util.Scanner;
public class ReverseANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = sc.nextInt();
        long rev = 0l;

        while(num < 0 || num > 0) {
            rev = rev * 10 + (num % 10);
            num /= 10;
        }

        if(rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
            System.out.println("0");
        }

        if(num < 0) {
            System.out.println("REVERSE OF NUMBER IS : "+ ((int)(-rev)));;
        }
        else {
            System.out.println("REVERSE OF NUMBER IS : "+((int)(rev)));
        }
    }
}
