// 24/01/2015


import java.util.Scanner;

public class TypeOfCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character");
        char ch = sc.next().charAt(0);

        String str = ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))?
        ((ch >= 'A' && ch <= 'Z')?(ch+" is an Uppercase Alphabet"):(ch+" is an Lowercase Alphabet")):
        ((ch >= '0' && ch <= '9')?(ch+" is a digit"):(ch+" is a special Character"));
        System.out.println(str);
    }
}
