package demo.packages2;

public class MyJavaClass {
    public static void main(String[] args) {
        demo.packages1.MyJavaClass myJavaClass2 = new demo.packages1.MyJavaClass();
        myJavaClass2.name = "Animesh";
        System.out.println(myJavaClass2.name);
        System.out.println(myJavaClass2.toString());
    }
}
