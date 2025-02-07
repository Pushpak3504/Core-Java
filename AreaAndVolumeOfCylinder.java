
import java.util.Scanner;

public class AreaAndVolumeOfCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Radius of the cylinder");
        float r = sc.nextFloat();
        System.out.println("Enter the Height of the cylinder");
        float h = sc.nextFloat();
        float area = 3.14f * r * r;
        System.out.println("The Area is : "+area);
        float volume = area * h;
        System.out.println("The Volume is : "+volume);

    }
}
