public class FibonacciSeries {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        System.out.print(a+" ");
        System.out.print(b+ " ");
        for(int i=0; i<20; i++) {
            
            int temp = a+b;
            a = b;
            b = temp;
            System.out.print(temp+" ");
            
        }
    }
}
