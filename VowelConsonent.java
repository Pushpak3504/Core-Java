//          24/01/2025

import java.util.Scanner;

public class VowelConsonent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        String str = (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' )?
        (ch+" is a Vowel"):(ch+" is a Consonent");
        System.out.println(str);
    }
}
