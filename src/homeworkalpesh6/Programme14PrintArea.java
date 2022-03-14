package homeworkalpesh6;
/* Write a java programme to print the area and perameter of a rectangle.
   Test Data :
   Width = 5.5 Height = 8.5
   Expected  Output:
   Area is 5.6 * 8.5 = 47.60
   perimegter is 2* (5.6 + 8.5) = 28.20*/

public class Programme14PrintArea {
 public static void main(String []args){
     // set the values of the width and height
     final double width = 5.6;
     final double height = 8.5;
     // work out the perimeter and the area
     double perimeter = 2 * ( height+width);
     double area = width * height;
     // display the perimeter and area
     System.out.printf("Perimeter is 2*(%.1f + %.1f) = %.2f  \n'", height, width,perimeter);
     System.out.printf("Area is %.1f * %.1f = %2f \n",width,height,area);
 }

}


