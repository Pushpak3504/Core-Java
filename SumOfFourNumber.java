public class SumOfFourNumber {
    public static void main(String[] args) {
        int num = 1234;

        int sum = 0;
        int evenSum = 0;
        int oddSum = 0;

        int rem = num % 10;
        sum = (rem % 2 == 0)?(evenSum = evenSum + rem):(oddSum = oddSum + rem);
        num = num / 10;

        rem = num % 10;
        sum = (rem % 2 == 0)?(evenSum = evenSum + rem):(oddSum = oddSum + rem);
        num = num / 10;

        rem = num % 10;
        sum = (rem % 2 == 0)?(evenSum = evenSum + rem):(oddSum = oddSum + rem);
        num = num / 10;

        rem = num % 10;
        sum = (rem % 2 == 0)?(evenSum = evenSum + rem):(oddSum = oddSum + rem);
        num = num / 10;

        System.out.println("The Sum of Even Numbers is : "+evenSum);
        System.out.println("The Sum of Odd Numbers is : "+oddSum);

    }
}
