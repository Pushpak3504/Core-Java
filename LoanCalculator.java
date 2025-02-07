
import java.util.Scanner;

public class LoanCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("            LOAN CALCULATOR");
        System.out.println();
        System.out.print("ENTER THE AMOUNT : ");
        float amt = sc.nextFloat();
        System.out.print("ENTER THE ROI : ");
        float roi = sc.nextFloat();
        System.out.print("ENTER THE TENURE (months) : ");
        int months = sc.nextInt();

        String str = (months/12)+"."+(months%12);
        float con = Float.parseFloat(str);

        float intYear = amt*roi/100;
        float totalInter = intYear*con;
        System.out.println();
        System.out.println("INTEREST : "+totalInter);
        float outStanding = amt + totalInter;
        System.out.println("TOTAL OUTSTANDING AMOUNT : "+outStanding);
        System.out.println();
        System.out.println("EMI : "+(outStanding/months)+" Rs");

    }
}
