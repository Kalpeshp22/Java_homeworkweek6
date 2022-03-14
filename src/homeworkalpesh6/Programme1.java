package homeworkalpesh6;

class Programme01 {
    // Declare instance variables
    int a = 200;
    String name = "Alpesh Panchal";
    // Declare an instance method
    public void car(){
        System.out.println(a);
        System.out.println(name);
    }
}

public class Programme1 {
    // Main method
   public static void main(String []args){
       // call instance method into a main method
       Programme01 obj = new Programme01();
       obj.car();

   }

}
