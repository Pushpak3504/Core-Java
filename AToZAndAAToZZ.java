import java.util.Scanner;
class AToZAndAAToZZ {
    public static void main(String[] args) {
        System.out.print("Enter the character or String from A to Z or AA to ZZ : ");
        String str = new Scanner(System.in).next().toUpperCase();
        int res = 0;

        for (int i = 0; i < str.length(); i++) {
            int val = 0;
            for (char ch = 'A'; ch <= str.charAt(i); ch++) {
                val++;
            }

            res = res * 26 + val; 
        }
        System.out.println(res);
    }
}
