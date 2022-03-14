package homeworkalpesh6;
/* 16. Write a java program to add two binary number.
   Input Data:
   Input first binary number : 10
   Input second binary number: 11
   Expected Output:
   su of two binary numbers: 101*/
 import java.util.Scanner;
 public class Programme16AddBinaryNumbers {
  public static void main(String[] args) {
   try (Scanner scanner = new Scanner(System.in)) {
    System.out.print("Enter 1st binary number;");
    String number1 = scanner.nextLine();

    System.out.print("Enter 2nd binary number;");
    String number2 = scanner.nextLine();

    System.out.println("Sum of binary number" + number1 + "and" + number2 + "is:" + add(number1, number2));
   }
  }
  public static String add(String num1,String num2){
   int num1Binary = Integer.parseInt(num1,2);
   int num2Binary = Integer.parseInt(num2,2);
   int sumOfNumber = num1Binary + num2Binary;
   return Integer.toBinaryString(sumOfNumber);
  }
 }
   //  Scanner scr = new Scanner ( System.in)


