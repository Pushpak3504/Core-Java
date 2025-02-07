public class Census {
    public static void main(String[] args) {
        long currPop = 312032486;
        long totalSeconds = (365 * 24 * 60 * 60) * 5;
        long birth = totalSeconds / 7;
        long death = totalSeconds / 13;
        long immigrant = totalSeconds / 45;
        long newPop = currPop + birth - death + immigrant;
        System.out.println("Current Population is : "+currPop);
        System.out.println("Population After 5 Years will be : "+newPop);  
    }
}
