import java.util.Scanner;
class CelciusToFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temprature in degree Celcius");
        double celcius = sc.nextDouble();
        double farenheit = (9.0 / 5)*celcius+32;
        System.out.println(celcius+" Degree Celcius in Farenheit is : "+farenheit);
    }
}
