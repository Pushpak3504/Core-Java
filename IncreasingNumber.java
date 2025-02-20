import java.util.Scanner;

class IncreasingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = sc.nextInt();
        boolean flag = false;
        int diff  =0;

        int rem1 = num%10;
        num/=10;

        for(int i=num; i>0; i/=10) {
            int rem2 = i % 10;
            diff = rem1 - rem2;

            if(diff > 0) {
                flag = true;
            }
        }

        if(flag) {
            System.out.println("Number is Increasing Number");
        }
        else {
            System.out.println("Number is not Increasing Number");
        }
    }
}
