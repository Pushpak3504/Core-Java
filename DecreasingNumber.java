import java.util.Scanner;
class DecreasingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = sc.nextInt();
        int diff = 0;
        boolean flag = false;

        int rem1 = num % 10;
        num/=10;

        for(int i=num; i>0; i/=10) {
            int rem2 = i % 10;
            diff = rem1 - rem2;

            if(diff < 0) {
                flag = true;
            } 
        }

        if(flag) {
            System.out.println("Number is Decreasing Number");
        }
        else {
            System.out.println("Number is not Decreasing Number");
        }
    }
}
