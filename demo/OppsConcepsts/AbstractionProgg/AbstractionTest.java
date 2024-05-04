package demo.OppsConcepsts.AbstractionProgg;

abstract class Animal{
    abstract void sound();
}

class Lion extends Animal{
    void sound(){
        System.out.println("Lion Sound....");
    }
}
class Tiger extends Animal{
    void sound(){
        System.out.println("Tiger Sound.......");
    }
}
class Main{
    public static void main(String[] args){
        Lion lion = new Lion();
        Tiger tiger =new Tiger();
        lion.sound();
        tiger.sound();
    }
}