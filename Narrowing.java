public class Narrowing {
    public static void main(String[] args) {

        long l = 4l;
        int i= (int) l;
        short s = (short) l;
        char ch = (char) l ;
        byte b = (byte) l;
        System.out.println(i);
        System.out.println(s);
        System.out.println(ch);
        System.out.println(b);
    }
}
