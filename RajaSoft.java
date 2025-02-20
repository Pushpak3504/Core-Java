
import java.util.Scanner;

public class RajaSoft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number : ");
        int num = sc.nextInt();

        int nPrime = 0;
        int pPrime = 0;

        for(int i=num-1; i>=2; i--) {
            boolean flag = true;
            for(int j=2; j<i; j++) {
                if(i%j == 0) {
                    flag = false;
                    break;
                }
            }
            if(flag) {
                pPrime = i;
                break;
            }
        }

        for(int i=num+1; ;i++) {
            boolean flag = true;
            for(int j=2; j<i; j++) {
                if(i%j == 0) {
                    flag = false;
                    break;
                }
            }
            if(flag) {
                nPrime = i;
                break;
            }
        }

        if(num-pPrime<nPrime-num) {
            System.out.println(pPrime+" "+num);
        }
        else if(num-pPrime>nPrime-num) {
            System.out.println(num + " "+nPrime);
        }
        else {
            System.out.println(pPrime+" "+num+" "+nPrime);
        }
    }
}
