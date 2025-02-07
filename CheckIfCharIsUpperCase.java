// 24/01/2015

import java.util.Scanner;

public class CheckIfCharIsUpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the charater");
        char ch = sc.next().charAt(0);

        System.out.println((ch >= '0' && ch <= '9')?("The character is Digit"):("The Character is not a Digit"));
        
    }
}
