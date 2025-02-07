//21/01/2025
class CondOperatorEx {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        int c = 1;

        int lar = (a>b)?((a>c)?(a):(c)):((b>c)?(b):(c));
        int smallest = (a<b)?((a<c)?(a):(c)):((b<c)?(b):(c));
        System.out.println("the larget number is : "+lar);
        System.out.println("the Smallest number is : "+smallest);
    }
}
