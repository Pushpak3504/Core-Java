
import java.util.Scanner;

class EVM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bjp = 0, cng = 0, ss = 0, aap = 0, mns = 0, nota = 0;
        System.out.println();
        System.out.println("        WELCOME");
        System.out.println();
        System.out.print("ENTER THE POPULATION : ");
        int pop = sc.nextInt();
        

        for(int i=1; i<=pop; i++) {
            System.out.println();
            System.out.println("*********LIST OF PARTIES*********");
            System.out.println("1. BJP");
            System.out.println("2. CONGRESS");
            System.out.println("3. SHIV SENA");
            System.out.println("4. AAP");
            System.out.println("5. MNS");
            System.out.println("6. NOTA");
            System.out.println();
            System.out.print("CHOOSE YOUR VOTE :");
            int vote = sc.nextInt();

            if(vote > 6 && vote < 1) {
                i--;
                System.out.println("INVALID SELECTION");
            }

            if(vote == 1) {
                bjp++;
                System.out.println("ACHE DIN AYENGE");
            }
            if(vote == 2) {
                cng++;
                System.out.println("DESH TODO");
            }
            if(vote == 3) {
                ss++;
                System.out.println("AMHI KHARI SENA");
            }
            if(vote == 4) {
                aap++;
                System.out.println("MUZE AZAD KARO");
            }
            if(vote == 5) {
                mns++;
                System.out.println("JAI MAHARASHTRA");
            }
            if(vote == 6) {
                nota++;
                System.out.println("YOU ARE A SMART PERSON");
            }
        }
        if(bjp >= cng && bjp >= ss && bjp >= aap && bjp >= mns && bjp >= nota) {
            System.out.println("BJP HAS WON THE ELECTION BY "+bjp+" Votes");
            return;
        }
        
        if(cng >= bjp && cng >= ss && cng >= aap && cng >= mns && cng >= nota) {
            System.out.println("CONGRESS HAS WON THE ELECTION BY "+cng+" Votes");
            return;
        }
        if(ss >= cng && ss >= bjp && ss >= aap && ss >= mns && ss >= nota) {
            System.out.println("SHIVSENA HAS WON THE ELECTION BY "+ss+" Votes");
            return;
        }
        if(aap >= cng && aap >= ss && aap >= bjp && aap >= mns && aap >= nota) {
            System.out.println("AAM ADAMI PARTY HAS WON THE ELECTION BY "+aap+" Votes");
            return;
        }
        if(mns >= cng && mns >= ss && mns >= aap && mns >= bjp && mns >= nota) {
            System.out.println("MA NA SE HAS WON THE ELECTION BY "+mns+" Votes");
            return;
        }
        if(nota >= cng && nota >= ss && nota >= aap && nota >= bjp && nota >= bjp) {
            System.out.println("NOTA HAS WON THE ELECTION BY "+nota+" Votes");
            return;
        }

    }
}
