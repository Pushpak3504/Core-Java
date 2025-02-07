class AvgSpeedInMiles {
    // runner runs 14 km in 45min 30 sec 
    //write program that displays avg speed in miles per hr
    //(1 km = 1.6 miles)

    public static void main(String[] args) {
        float totalMiles = 14 * 0.625f;
        float totalHrs = (45.0f/60f) + (30.0f / 3600f);
        float avgSpeed = totalMiles / totalHrs;
        System.out.println("The Average speed of the runner is : "+avgSpeed+" miles per hrs");

    }
}
