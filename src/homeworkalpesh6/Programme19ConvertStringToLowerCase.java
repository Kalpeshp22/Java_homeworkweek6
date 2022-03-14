package homeworkalpesh6;
/* 19. Write a java programme to convert a given string into lowercase.
  sample input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
  Output. the quick brown fox jumps over the lazy dog.*/

import java.util.Locale;

public class Programme19ConvertStringToLowerCase {
    public static void main(String[] args) {
        // set the initial value of the string
        String txt=" THE QUICK BROWN FOX JUMP OVER THE LAZY DOG";
        // convert all upper case values to lower case and print it
        System.out.println(txt.toLowerCase());
    }
}
