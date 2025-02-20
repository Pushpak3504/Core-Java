public class NumberSeries2 {
    public static void main(String[] args) {
        int num = 79;
        int primeNum = 29;
        int newprimeNum = 29;
        for(int i=1; i<=5; i++) {
            System.out.println(num);
            num = num + newprimeNum;
            while(primeNum>0) {
                if(isPrime(primeNum)) {
                    newprimeNum = primeNum;
                    break;
                }
                primeNum++;
            }
        }
    }

    public static boolean isPrime(int num) {
        boolean flag = true;
        for(int i=2; i<num; i++) {
            if(num % i == 0) {
                flag = false;
                break;
            }
        }

        if(!flag) 
            return false;
        return true;
    }
}
