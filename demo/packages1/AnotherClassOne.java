package demo.packages1;

public class AnotherClassOne {
    
    public static void main(String[] args) {
        MyJavaClass myJavaClass = new MyJavaClass();
        myJavaClass.name = "Ashish";
        myJavaClass.age = 30;

        System.out.println(myJavaClass.toString());
        myJavaClass.setAddress("Usmanpur 3rd Pusta");
        System.out.println(myJavaClass.getAddress());
    }
}
