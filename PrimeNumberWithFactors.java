import java.util.Scanner;
class PrimeNumberWithFactors {
    public static void main(String[] args) {
        System.out.print("Enter the Number : ");
        int num = new Scanner(System.in).nextInt();
        int cnt = 0;

        for(int i=2; i<num; i++) {
            if(num % i == 0) {
                cnt++;
            }
        }

        System.out.println(cnt == 0 ? (num+" is Prime Number"):(num+" is Not a Prime Number"));
    }
}
