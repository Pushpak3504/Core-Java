import java.util.Scanner;

class PrimeNumbersFromUserRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range : ");
        int range = sc.nextInt();
        int count = 0;

        for(int i=2; i<range; i++) {
            boolean flag = true;
            for(int j=2; j<i; j++) {
                if(i%j == 0) {
                    flag = false;
                }
            }
            if(flag) {
                count++;
            }
        }

        for(int i=2; i<range; i++) {
            boolean flag = true;
            for(int j=2; j<i; j++) {
                if(i % j == 0) {
                    flag = false;
                }
            }

            if(flag) {
                int num = i;
                loop:
                while(num > 0) {
                    int rem = num%10;

                    boolean flag2= true;

                    for(int k=2; k<=rem; k++) {
                        for(int z=2 ; z<k; z++) {
                            if(k%z == 0) {
                                flag2 = false;
                            }
                        }
                    }
                    if(!flag2) {
                        count--;
                    }

                    num /= 10;
                }
            }
        }
        System.out.println(count);
    }


}