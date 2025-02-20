import java.util.Scanner;

class DuckNumber {
    public static void main(String[] args) {
        //contains at least 1 zero
        //zero sould not be at start
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number : ");
        String str = sc.next();

        if(str.charAt(0)=='0') {
            System.out.println(str+" is Not a Duck Number");
        }
        else {
            if(str.contains("0")) 
                System.out.println(str+" is a Duck Number");
            else 
                System.out.println(str+" is Not a Duck Number");
        }

    }
}
