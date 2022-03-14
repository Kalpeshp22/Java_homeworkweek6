package homeworkalpesh6;
/* Write a Java program to pring the sum (addtion), multiplication,substract,divide and remainde of two numbers.
  Test Data:
  Input first number : 135
  Input second numebr : 44
  Expected Output :
  135 + 44  = 179
  135 - 44  =  91
  135 * 44  = 5940
  135 / 44  =  3.
  135 mod 44 = 5*/

public class Programme18SumsReminders {
    public static void main(String[] args) {
        // set the initial value of the variables a, b
        int a = 135;
        int b = 44;
        // display the values of the variables
        System.out.println("a= " + a);
        System.out.println("b= " + b);
        // display the value of a + b
        System.out.print("a+b");
        System.out.println(a+b);
        // display the value of a - b
        System.out.print("a-b");
        System.out.println(a-b);
        // display the values of a * b
        System.out.print("a*b");
        System.out.println(a*b);
        // display the values of a / b
        System.out.print("a/b");
        System.out.println(a/b);
        // display the values of a % b
        System.out.print("a%b=");
        System.out.println(a%b);
    }


}
