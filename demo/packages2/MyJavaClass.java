package demo.packages2;

public class MyJavaClass {
    
    
    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }

    public static void main(String[] args) {
        demo.packages1.MyJavaClass myJavaClass2 = new demo.packages1.MyJavaClass();
        myJavaClass2.name = "Animesh";
        System.out.println(myJavaClass2.name);
        System.out.println(myJavaClass2.toString());
    }

    @Override
    public String toString() {
        return "MyJavaClass []";
    }
}
