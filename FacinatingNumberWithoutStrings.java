class FacinatingNumberWithoutStrings {
    public static void main(String[] args) {
        int num = 327;
        int temp = num;
        boolean flag = true;

        for(int i=2; i<=3; i++) {
            num = (num * 1000) + (temp * i);
        }
        System.out.println(num);
        for(int i=1; i<=9; i++) {
            int cnt = 0;
            for(int j=num; j>0; j/=10) {
                int rem = j % 10;
                if(rem==i) {
                    cnt++;
                }
            }

            if(cnt!=1) {
                flag = false;
                break;
            }
        }

        System.out.println(flag?temp+" is a Facinating Number":temp+" is Not a Facinating Number");
    }
}
