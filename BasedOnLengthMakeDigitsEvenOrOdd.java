import java.util.Scanner;

class BasedOnLengthMakeDigitsEvenOrOdd {
    public static void main(String[] args) {
        System.out.print("Enter The Number : ");
        int num = new Scanner(System.in).nextInt();
        String s = String.valueOf(num);
        int rev = 0;
        int rem = 0;
        if(s.length() % 2 == 0) {
            while(num > 0) {
                rem = num % 10;
                if(rem % 2 == 0) {
                    rev = rev * 10 + (rem);
                }
                else {
                    rem = rem + 1;
                    rev = rev * 10 + (rem);
                }
                num /= 10;
            }
        }
        else {
            while(num > 0) {
                rem = num % 10;
                if(rem % 2 != 0) {
                    
                    rev = rev * 10 + (rem);
                }
                else {
                    rem = rem + 1;
                    rev = rev * 10 + (rem);
                }
                num /= 10;
            }
        }

        int op = 0;
        while(rev > 0) {
            op = op * 10 + (rev % 10);
            rev /= 10;
        }

        System.out.println(op);

    }
}
