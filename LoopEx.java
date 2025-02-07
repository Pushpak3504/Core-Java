import java.util.Scanner;
class LoopEx {
    public static void main(String[] args) {

        //Numbers from 1 to 10

        // for(int i=1; i<=10; i++) {
        //     System.out.print(i+" ");
        // }
        // System.out.println();

        //char from A to Z

        // for(char i='A'; i<='Z'; i++) {
        //     System.out.print(i+" ");
        // }
        // System.out.println();

        // char from Z to A

        // for(char i='Z'; i>='A'; i--) {
        //     System.out.print(i+" ");
        // }

        // System.out.println();

        //digit from 0 to 9

        // for(char i='0'; i<='9'; i++) {
        //     System.out.print(i+" ");
        // }

        //ascii table

        // for(int i=0; i<=127; i++) {
        //     System.out.println(i+": "+((char)i)+" ");
        // }
        // System.out.println();
        
        //table 

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the Number : ");
        // int num = sc.nextInt();
        // System.out.print("Enter the range : ");
        // int range = sc.nextInt();

        // for(int i=1; i<=range; i++) {
        //     System.out.println(num+" X "+i+" = "+ (num * i));
        // }

        //alphabet series
        // int c = 1;
        // for (char i='A'; i<='Z'; i+=c) {
        //     System.out.print(i+" ");
        //     c++;
        // }

        //born -> ready/runnable (wants a pc register) -> running -> dead


        //print characters from username 
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter Your Username : ");
        // String s = sc.next().toUpperCase();
        // for(int i=0; i<s.length(); i++) {
        //     System.out.print(s.charAt(i));
        //     Thread.sleep(1000);
        // }

        // for(int i=1; i<=100; i++) {
        //     if(i%2 == 0) {
        //         System.out.print(i+" ");
        //     }
        // }

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Username : ");
        String s = sc.next().toUpperCase();
        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                System.out.print(s.charAt(i));
            }
        }


    }
}
