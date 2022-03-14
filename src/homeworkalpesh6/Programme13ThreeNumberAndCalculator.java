package homeworkalpesh6;

import java.util.Scanner;

public class Programme13ThreeNumberAndCalculator {
    public static void main(String[] args) {
        // create a new scanner object
        Scanner ob = new Scanner(System.in);
        System.out.println("Input the first numbers");
        // input the first number
        double first = ob.nextDouble();
        System.out.println("Input the second numbers");
        // input the second number
        double second = ob.nextDouble();
        System.out.println("Input the third numbers");
        // input the third number
        double third = ob.nextDouble();
        // add the three inputs together and divide by the number of inputs
        double avg = (first + second + third) / 3;
        System.out.println("The average of the three numbers is " + avg);
    }
}
