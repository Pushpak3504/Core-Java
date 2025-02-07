
import java.util.Scanner;

public class FindNumOfYears {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of minutes :");
        long min = sc.nextLong();
        long dayscalculation = ((min / 60) / 24 );
        long yearscalculation = dayscalculation / 365;
        long newdays = dayscalculation % 365;
        System.out.println(min + "minutes is approximately "+yearscalculation+" years and "+newdays+" days");
    }
}
