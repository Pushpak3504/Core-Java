public class EmirpNumber {
    public static void main(String[] args) {
        int num = 71;
        int dup = num;
        
        int rev = 0;
        boolean flag = true;
        for(int i=2 , j=dup; i<num && j>0; i++, j/=10) {
            if(num%i==0) {
                flag = false;
                break;
            }

            rev = rev * 10 + (j %10) ;

            if(rev % i == 0) {
                flag = false;
                break;
            }

        }

        if(flag) {
            System.out.println("The Entered Number is Emirp Number "+dup);
        }
        else {
            System.out.println("The Entered Number is Not Emirp Number ");
        }

        


    }
}
