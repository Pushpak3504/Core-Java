// 10 FEB 2025 ( Maximum Digit In a Number )

class MaxDigitInNum {
    public static void main(String[] args) {
        int num = 62385692;
        int max = 0;

        for(int i=num; i>0; i/=10) {
            int rem = i % 10;
            if(max < rem) 
                max = rem;
        }

        System.out.println("Maximum Digit in a "+num+ " is : "+max);
    }    
}
