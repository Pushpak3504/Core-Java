//  18-02-2025
// Program 3

import java.util.Scanner;
public class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number : ");
        int num = sc.nextInt();
        int len = 0;
        int div = 1;
        for(int i=num; i>0; i/=10) {
            len++;
        }

        for(int i=1; i<=len; i++) 
            div*=10;

        if(num == (num*num)%div) {
            System.out.println(num+" is an Automorphic Number");
        }
        else {
            System.out.println(num+" is not an Automorphic Number");
        }
    }
}
