package homeworkalpesh6;
import java.util.Scanner;

public class Programme06RadiuseValue {
    // create a method that takes in the radius as a parameter and prints out the area of that circle
    static void areaOfCircle(int rad) {
        double area = Math.PI * (rad * rad);
        System.out.println("Area of a circle with radius " + rad + " is " + area + " cm^2");
    }

    public static void main(String[] args) {
        // create a new scanner object
        Scanner inp = new Scanner(System.in);

        System.out.println("What is the radius of the circle");
        // input the next integer
        int rad = inp.nextInt();
        // call the area method
        areaOfCircle(rad);
    }
}
