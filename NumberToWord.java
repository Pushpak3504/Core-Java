public class NumberToWord {
    public static void main(String[] args) {
        int num = 1234;
        
        String ans = "";
        while(num > 0) {
            int rem = num % 10;
            switch(rem) {
                case 1 : {
                     ans = "ONE "+ans;
                    break;
                }
                case 2 : {
                     ans = "TWO "+ans;
                    break;
                }
                case 3 : {
                     ans = "THREE "+ans;
                    break;
                }
                case 4 : {
                     ans = "FOUR "+ans;
                    break;
                }
                case 5 : {
                     ans = "FIVE "+ans;
                    break;
                }
                case 6 : {
                     ans = "SIX " +ans;
                    break;
                }
                case 7 : {
                     ans = "SEVEN "+ans;
                    break;
                }
                case 8 : {
                     ans = "EIGHT "+ans;
                    break;
                }
                case 9 : {
                     ans = "NINE "+ans;
                    break;
                }
                case 0 : {
                    ans = "ZERO "+ans;
                    break;
                }
                
                
            }
    
            num/=10;
        }
        System.out.println(ans);
    }
}
