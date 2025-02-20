public class FrequencyOfDigit {
    public static void main(String[] args) {
        int min = Integer.MAX_VALUE ;
        int num = 123123133;
        int dgt = 0;
        System.out.println(num);
        for(int i=0; i<=9; i++) {
            int cnt =0 ;
            for(int j=num; j>0; j/=10) {
                int rem = j%10;
                if(i == rem) {
                    cnt++;
                }
            }
            if(cnt < min && cnt > 0) {
                min = cnt;
                dgt = i;
            }
        }
        System.out.println("MAX FREQ = "+min+" of Num "+dgt);

    }
}
