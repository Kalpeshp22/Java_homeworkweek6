package homeworkalpesh6;

import java.util.Locale;
import java.util.Scanner;

public class Programme09LowerCaseToUpperCase {
    public static void main(String[] args) {
        // create a new scanner object
        Scanner ob = new Scanner(System.in);

        System.out.println("Input a text in Upper case here");
        // input the next string
        String upper = ob.next();
        // output the string but convert any lower case letters to upper case
        System.out.println("your input to lower case is " + upper.toUpperCase(Locale.ROOT));
    }
}
