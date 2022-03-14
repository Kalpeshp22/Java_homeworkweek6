package homeworkalpesh6;

class Programme2 {
    // Declare two static variable
    public static int a = 500;
    public static int b = 400;

    public static int c = 0;
    // Declare one statc method
    public static void test(){
        // call both variable into static method in print
        System.out.println(a);
    }
    public static void change(){
        c = 100;
    }
}

public class Programme02 {
     // Declare main method
    public static void main (String []arg ){
        // call the static method into the main method
        System.out.println(Programme2.a);
        System.out.println(Programme2.b);

        System.out.println(Programme2.c);
        Programme2.change();
        System.out.println(Programme2.c);
    }


}
