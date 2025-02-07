public class ProductOfNumbers {
    public static void main(String[] args) {
        int num = 1234;
        int product = 1;

        int rem = num % 10;
        product = product * rem;
        num = num / 10;

        rem = num % 10;
        product = product * rem;
        num = num / 10;
        
        rem = num % 10;
        product = product * rem;
        num = num / 10;
        
        rem = num % 10;
        product = product * rem;
        
        System.out.println("The Product of each digit of the Number is : "+product);
        
    }
}
