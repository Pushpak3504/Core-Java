public class CheckWheatherNumberIsPallindrome {
    public static void main(String[] args) {
        int num = -121;
        int dup = num;
        int rev = 0;

        if(num < 0) {
            System.out.println("The Number is Not Pallindrome");
        }
 
        while(num > 0) {
            rev = rev * 10 + (num%10);
            num /= 10;
        }

        if(rev == dup) {
            System.out.println("The Number is Pallindrome");
        }
    }
}
