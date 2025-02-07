import java.util.Scanner;

public class PoundsToKg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the weight in Pounds : ");
        float pounds = sc.nextFloat();
        float kg = (0.454f ) * pounds;
        System.out.println(pounds+" pounds is "+kg+" kilograms");
    }
}
