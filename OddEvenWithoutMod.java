import java.util.Scanner;

public class OddEvenWithoutMod {
    public static void main(String[] args) {
        System.out.println("Enter the NUmber");
        int num = new Scanner(System.in).nextInt();
        System.out.println(num/2 == num/2.0); //here i have done 1 but proper way is using num/2.0 
        System.out.println((num/2)*2 == num); // another way for even odd without % operator
    }
}
