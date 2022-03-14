package homeworkalpesh6;
/* write a Java programme to covnert a decimal number to binary number.
   Input Data;
   Input a Decimal Number 5;
   Expexcted  Output
   Binary number is : 101 */
import java.util.Scanner;
public class Programme17Decimal {
    double num;

    public static void main(String[] args) {
        Programme17Decimal Programme17Decimal = new Programme17Decimal();
        Programme17Decimal.strbinary();
    }
    public void strbinary(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number;");
        num = sc.nextDouble();
        System.out.println(Integer.toBinaryString((int)num));

    }

}
