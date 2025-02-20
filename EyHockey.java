public class EyHockey {
    public static void main(String[] args) {
        String sit = "1111111000";
        int cnt0= 0;
        int cnt1 = 0;

        for(int i=0; i<sit.length(); i++) {
            char ch = sit.charAt(i);
            if(ch == '1') {
                cnt1++;
            }
            else if(ch == '0') {
                cnt0++;
            }
            else {
                cnt1 = 0;
                cnt0 = 0;
            }

            if(cnt1>=7 || cnt0 >= 7) {
                break;
            }
        }

        System.out.println((cnt1>=7 || cnt0 >= 7)?("Yes"):("No"));
    }
}
