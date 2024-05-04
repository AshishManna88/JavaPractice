package demo.OppsConcepsts.InheritaceProgg;

public class InnerClass {
    
    static class StaticClass {

        public void innerFunc1(){
            System.out.println("Inner Class Function one");
        }
        
    }
    public class InnerInnerClass_1 {
    
        public void innerFunc2(){
            System.out.println("Inner Class Function two");
        }
    }
}

class Test {

    public static void main(String[] args) {
        InnerClass inner = new InnerClass();

        //----------- Static class object creation
        InnerClass.StaticClass innerClass = new InnerClass.StaticClass();
        innerClass.innerFunc1();

        //----------- without Static object creation

        InnerClass.InnerInnerClass_1 inCl = inner.new InnerInnerClass_1();
        inCl.innerFunc2();
    }
    
}
