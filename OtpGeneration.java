public class OtpGeneration {
    public static void main(String[] args) {
        String otp = "";

        for(int i=0; i<10; ) {
            otp += (int)(Math.random()*1000000);
            if(otp.length() == 6) {
                System.out.println(otp);
                i++;
            }
            otp = "";
        }
    }
}
