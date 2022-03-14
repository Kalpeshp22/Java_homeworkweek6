package homeworkalpesh6;

import java.util.Scanner;

public class Programme10MultiplicationTable {
    public static void main(String[] args) {
        // create a new scanner object
        Scanner ob = new Scanner(System.in);

        System.out.println("What times table do you want?");
        // input the next integer (the number of which the tables you want)
        int table = ob.nextInt();
        // use a for loop to display the tables
        for (int i = 0; i <= 10; i++){
            System.out.println(i + " * " + table + " = " + table * i );
        }
    }
}
