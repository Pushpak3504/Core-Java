public class RemoveDuplicatesFromNum {
    public static void main(String[] args) {
        int num = 1231231;
        System.out.println(num);
        for(int i=0; i<=9; i++) {
            int cnt =0 ;
            for(int j=num; j>0; j/=10) {
                int rem = j%10;
                if(i == rem) {
                    cnt++;
                }
            }
            if(cnt > 0) {
                System.out.print(i);
            }
        }
    }
}
