public class ISBN_Number {
    public static void main(String[] args) {
        long num = 1259060977l;
        int sum = 0;
        for(long i = num, j=1; i>0; i/=10, j++) {
            long rem = i%10;
            sum+= rem*j;
        }
        System.out.println((sum%11==0)?(num+" is Valid ISBN Number"):(num+ " is not ISBN Number"));
    }
}
