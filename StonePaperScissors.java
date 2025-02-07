
import java.util.Scanner;

public class StonePaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rnum = 0;
        for(;;) {
            int num = (int) (Math.random()*10);
            if(num >= 1 && num <=3) {
                rnum = num;
                break;
            }
        }

        String codeOpt = null;
        if(rnum == 1) {
            codeOpt = "STONE";
        }
        else if(rnum == 2) {
            codeOpt = "PAPER";
        }
        else if(rnum == 3) {
            codeOpt = "SCISSORS";
        }

        System.out.println("");
        System.out.println("--------------WELCOME------------------");
        System.out.println();
        System.out.println("1. STONE");
        System.out.println("2. PAPER");
        System.out.println("3. SCISSORS");
        System.out.println();
        System.out.print("ENTER OPTION : ");
        int opt = sc.nextInt();
        String userOpt = null;

        if(opt == 1) {
            userOpt = "STONE";
        }
        else if(opt == 2) {
            userOpt = "PAPER";
        }
        else if(opt == 3) {
            userOpt = "SCISSORS";
        }
        else {
            System.out.println("INVALID INPUT");
            return;
        }

        System.out.println("USER : "+userOpt +" |  BOT : "+codeOpt );
        System.out.println();

        if((opt == 1 && rnum == 3) || (opt == 2 && rnum == 1) || (opt == 3 && rnum == 2)) {
            System.out.println("---------USER WINS----------");
        }
        else if((opt == 1 && rnum == 2) || (opt == 2 && rnum == 3) || (opt == 3 && rnum == 1)) {
            System.out.println("--------BOT WINS--------");
        }
        else {
            System.out.println("------DRAW----------");
        }
    } 
}
