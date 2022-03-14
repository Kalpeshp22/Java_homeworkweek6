package homeworkalpesh6;

public class Programme04 {
    // declare 2 static and 2 instance methods
    int a = 150;
    String name = "Alpesh";
    static int b = 250;
    static String surname = "Panchal";

    // create a instance method that prints out the values of the variables
    public void test() {
        System.out.println(a);
        System.out.println(name);
        System.out.println(b);
        System.out.println(surname);

    }
    static public void test1() {
        // create an instance
        Programme04 obj = new Programme04();
        System.out.println(obj.a);
        // create another instance
        Programme04 obj1 = new Programme04();
        // print out attributes of the object
        System.out.println(obj1.name);
        System.out.println(b);
        System.out.println(surname);

    }

    public static void main(String args[]) {
        // create a new instance
        Programme04 obj = new Programme04();
        // call the method from the new instance created
        obj.test();
        test1();
    }
}
