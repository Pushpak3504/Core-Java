import java.util.Scanner;
public class PrimeInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE RANGE : ");
        int range = sc.nextInt();
        for(int i=2; i<range; i++) {
            boolean flag= true;
            for(int j=2; j<i; j++) {
                if(i%j == 0) {
                    flag = false;
                }
            }
            if(flag) {
                System.out.print(i+ " ");
            }
        }
    }
}
