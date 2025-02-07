// 28-01-25


import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("           Currency Converter");
        System.out.println();
        System.out.print("Enter Amount(INR) : ");
        float inr = sc.nextFloat();
        System.out.println();

        System.out.println("--------------------LIST OF CURRENCIES--------------------");
        System.out.println("1. USD");
        System.out.println("2. EUR");
        System.out.println("3. GBP");
        System.out.println("4. PKR");
        System.out.println("5. AUD");
        System.out.println("5. KRW");

        System.out.print("Enter the Currency to Convert : ");
        String s = sc.next().toUpperCase();
        float conCurr = 0;

        if(s.equals("USD")) {
            conCurr = inr / 86.56f;
            System.out.println(inr+" INR = "+conCurr+" USD");
        }
        else if(s.equals("EUR")) {
            conCurr = inr / 90.25f;
            System.out.println(inr+" INR = "+conCurr+" EUR");
        }
        else if(s.equals("GBP")) {
            conCurr = inr / 107.713f;
            System.out.println(inr+" INR = "+conCurr+" GBP");
        }
        else if(s.equals("PKR")) {
            conCurr = inr / 0.30885f;
            System.out.println(inr+" INR = "+conCurr+" PKR");
        }
        else if(s.equals("AUD")) {
            conCurr = inr / 54.2997f;
            System.out.println(inr+" INR = "+conCurr+" AUD");
        }
        else if(s.equals("KRW")) {
            conCurr = inr / 0.06017f;
            System.out.println(inr+" INR = "+conCurr+" KRW");
        }
        else {
            System.out.println("INVALID SELECTION");
        }

        
    }
}
