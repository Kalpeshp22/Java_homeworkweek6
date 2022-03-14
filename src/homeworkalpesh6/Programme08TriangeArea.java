package homeworkalpesh6;

import java.util.Scanner;

public class Programme08TriangeArea {
    // create a triangle that takes in the height and the base as parameters
    static void AreaTri(double height, double base){
        double area = 0.5 * base * height;
        System.out.println("Area of a triangle with the base of " + base + " and the height of " + height + " = " + area);

    }

    public static void main(String[] args) {
        // create a new scanner object
        Scanner obj = new Scanner(System.in);

        System.out.println("Input the height of the triangle");
        // input the height
        double height = obj.nextDouble();

        System.out.println("Input the length of the base of the triangle");
        // input the size of the base
        double base = obj.nextDouble();
        // call AreaTri method and put both height and base inputs as parameters
        AreaTri(height, base);
    }
}
