//  18-02-2025
// Program 1  
// HW (Program 2 ) - Without using String


class FacinatingNumber {
    public static void main(String[] args) {
        int num = 327;
        String str = num+""+(num*2)+(num*3);
        boolean flag = true;

        for(char i='1'; i<='9'; i++) {
            int cnt = 0;
            for(int j=0; j<str.length(); j++) {
                char ch = str.charAt(j);
                if(i==ch)
                    cnt++;
            }

            if(cnt!=1) {
                flag = false;
                break;
            }
        }

        if(flag) {
            System.out.println(num+" is Facinating Number");
        }
        else {
            System.out.println(num+" is Not Facinating Number");
        }
    }
}
