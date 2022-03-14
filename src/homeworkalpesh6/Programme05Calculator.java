/* Write down a programme for a caluculator */

package homeworkalpesh6;
import java.util.Scanner;

class Calc {
    // add numbers
    public void add(double first, double second){
        double sum = first + second;
        System.out.println("The addition of " + first + " and " + second + " = " + sum);
    }
    // subtract numbers
    public void sub(double first,double second){
        double sub = first - second;
       System.out.println("The subtraction of " + first + " and " + second + " = " + sub);
    }
    // mutliply numbers
    public static void mult(double first, double second) {
        double mult = first * second;
        System.out.println("The multiplication of " + first + " and " + second + " = " + mult);
    }
    // divide numbers
    public static void div(double first, double second) {
        double div = first / second;
        System.out.println("The division of " + first + " and " + second + " = " + div);
    }
}

public class Programme05Calculator {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        // input the first number
        System.out.println("Input your first number");
        double first = obj.nextDouble();

        // input the second number
        System.out.println("Input your second number");
        double second = obj.nextDouble();
        // Create a new instance of the calc class
        Calc method = new Calc();

        // call a addition method
        method.add(first, second);
        // call the subtraction method
        method.sub(first, second);
        // call the static mult method
        Calc.mult(first, second);
        // call the static div method
        Calc.div(first, second);

    }

}
