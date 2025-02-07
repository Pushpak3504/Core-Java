
//23/01/2025

import java.util.Scanner;

public class BmiCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter weight in pounds");
        float pounds = sc.nextFloat();
        System.out.println("Enter Your Height in Inches");
        float inches = sc.nextFloat();

        float kg = pounds * 0.45359237f;
        float meter = inches * 0.0254f;

        float bmi = kg/(meter * meter);
        System.out.println("BMI is "+bmi);
    }
}
