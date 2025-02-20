
import java.util.Scanner;

class TempratureConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("----------------------TEMPRATURE CONVERTER----------------------");
        System.out.println();

        System.out.print("Enter The Temprature in Degree Celcius : ");
        double dc = sc.nextDouble();

        System.out.println("CHOOSE THE OPTION TO CONVERT");
        System.out.println("1. Degree Farainheit");
        System.out.println("2. Kelvin");
        System.out.println("3. Rankine");

        int opt = sc.nextInt();
        double converted = 0;
        
        if(opt == 1) {
            converted = ((dc * (9/5)) + 32);
            System.out.println(dc+" *C : "+converted+" *F"); 
        }
        else if(opt == 2) {
            converted = dc + 273.15;
            System.out.println(dc+" *C : "+converted+" K");
        }
        else if(opt == 3) {
            converted = ((dc * (9/5)) + 491.67);
            System.out.println(dc+" *C : "+converted+" *R"); 
        }

    }
}
