//11 FEB 2025 (MAKE A NUMBER PRIME)

import java.util.Scanner;
public class MakeANumberPrime {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        boolean flag = true;
        // int op=0;

        // for(int i=2; i<num; i++) {
        //     if(num % i != 0) {
        //         op = num;
        //     }
        //     else {
        //         num++;
        //         for(int j=2; j<num; j++) {
        //             if(i % j != 0) {
        //                 op= num;
        //                 break; 
        //             }
        //         }
        //     }
        // }
        // System.out.println(op);

        for(int i=2; i<num; i++) {
            if(num%i==0) {
                flag = false;
                num++;
                i=2;
            }
        }
        System.out.println("num "+num);
    }

}
