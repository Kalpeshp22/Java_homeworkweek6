package homeworkalpesh6;

import java.util.Scanner;

public class Programme07TemprauteValue {
    // create a conversion method that takes in the temperature as Fahrenheit
    static void FtoC(double F) {
        double C = (F - 32) * 5/9;
        System.out.println("From Fahrenheit to Celsius " + F + " is " + C);
    }

    public static void main(String[] args) {
        // create a new scanner object
        Scanner inp = new Scanner(System.in);

        System.out.println("Input temperature in Fahrenheit");
        // input the next double
        double temp = inp.nextDouble();
        // call the FtoC method and put the input as a parameter
        FtoC(temp);
    }
}
