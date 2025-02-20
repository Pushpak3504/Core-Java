import java.util.Scanner;

class EvilNumber {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        String bin = "";
        for(int i=num; i>0; i/=2) {
            bin = (i%2)+bin;
        }
        int cnt = 0;
        for(int i=0; i<bin.length(); i++) {
            if(bin.charAt(i) == '1') {
                cnt++;
            }
        }

        if(cnt%2 == 0) {
            System.out.println(num+" is Evil Number");
        }
        else {
            System.out.println(num+" is Not Evil Number");
        }
    }
}
