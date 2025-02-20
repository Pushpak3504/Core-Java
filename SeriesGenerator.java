public class SeriesGenerator {
    public static void main(String[] args) {
        int n = 6; 
        int num = 1; 
        int multipier = 3;
        int nextNum = 3;

        System.out.print(num+" ");

        for (int i = 1; i < 6; i++) {
            int newNum = (nextNum - num) * multipier ;
            System.out.print(newNum+" ");
            multipier++;
        }
    }
}