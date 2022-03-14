package homeworkalpesh6;

public class Programme03 {
    // Declare instance and static variables
    int a = 90;
    static int b = 50;
    // Declare instance and static methods
    public void test() {
        System.out.println(a);
        System.out.println(b);
    }
    public static void test1() {
        Programme03 obj = new Programme03();
        System.out.println(obj.a);
        System.out.println(b);

    }

    public static void main(String[] args) {
        // Create a new instance
        Programme03 obj = new Programme03();
        // call instance method
        obj.test();
        System.out.println("=========");
        // call static method
        test1();

    }
}



