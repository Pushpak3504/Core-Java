public class AreaAndPerimeterOfCircle {
    public static void main(String[] args) {
        final float pi = 3.14f;
        float r = 5.5f;
        float perimeter = 2 * pi * r;
        System.out.println("The Perimeter of circle having radius 5.5 is : "+perimeter);
        float area = pi * (r * r);
        System.out.println("The Area of circle having radius 5.5 is : "+area);
    }
}
