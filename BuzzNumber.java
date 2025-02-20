class BuzzNumber {
    public static void main(String[] args) {
        int num = 117;
        if((num%7==0) || (num%10)==7) {
            System.out.println(num+" is Buzz Number");
        }
        else {
            System.out.println(num+" is not Buzz Number");
        }
    }
}
