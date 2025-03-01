import java.util.Scanner;
class BouncyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = sc.nextInt();

        boolean flagInc = true;
        boolean flagDec = true;

        int rem1 = num % 10;

        for(int i=num; i>0; i/=10) {
            int rem2 = i % 10;
            if(rem2 > rem1) {
                flagInc = false;
                break;
            }
            rem1=rem2;
        }

        rem1 = num % 10;
        
        for(int i=num; i>0; i/=10) {
            int rem2 = i % 10;
            if(rem2 < rem1) {
                flagDec = false;
                break;
            }
            rem1 = rem2;
        }

        if(!flagInc && !flagDec) 
            System.out.println("The Number is Bouncy Number");
        else 
            System.out.println("The Number is not Bouncy Number");
    }
}
