public class SpyNumber {
//     Input : 22
// Output:  Given number is a SPY number.
// Explanation: Sum of the number is 4 (2 + 2)
//              Product of the number is as 4 (2 * 2) 
    public static void main(String[] args) {
        int num = 22;
        int sum = 0;
        int product = 1;
        for(int i=num; i>0; i/=10) {
            int rem = i%10;
            sum += rem;
            product *= rem;
        }

        if(sum == product) {
            System.out.println(num+" is Spy Number");
        }
        else {
            System.out.println(num+" is not Spy Number");
        }
    }
}
