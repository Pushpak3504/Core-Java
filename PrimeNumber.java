// 23/01/2025


import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = sc.nextInt();
        System.out.println((num == 2 || num == 3 | num == 5)?(num+" is a prime Number"):((num%2 == 0 || num % 3 == 0 || num%5 == 0)?(num+" is Not a Prime Number"):(num+" is Prime Number")));
    }
}