import java.util.Scanner;

public class PasswordProgram {
    public static void main(String[] args) throws InterruptedException{
        Scanner sc = new Scanner(System.in);
        int stored = 123;
        int sec = 5000;
        outer:
        for(;;) {
            int attempts = 3;
            do { 
                System.out.print("Enter The PIN : ");
                int pin = sc.nextInt();
    
                if(stored == pin) {
                    System.out.println("PHONE UNLOCKED");
                    break outer;
                }
                else {
                    System.out.println("WRONG PIN");
                    System.out.println("ATTEMPTS LEFT : "+(attempts - 1));
                }
                attempts--;
                
            } while (attempts >= 1);
            
            System.out.println();
            System.out.println("PHONE IS DISABLED FOR : "+(sec/1000)+" Seconds");
            Thread.sleep(sec);
            sec *= 2;
            System.out.println();
        }
    }
}
