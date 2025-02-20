class MinDigitInNum {
    public static void main(String[] args) {
        int num = 62385692;
        int min = Integer.MAX_VALUE;

        for(int i=num; i>0; i/=10) {
            int rem = i % 10;
            if(min > rem) 
                min = rem;
        }

        System.out.println("Minimum Digit in a "+num+ " is : "+min);
    }    
}
