package demo.OppsConcepsts.EncapsulationProgg;

public class EncapsulationPractice {
    private int age;    // Access only in this class
    int id;             // Access only in this package
    protected String address; // Access outside package but call will be inherited
    public String name; //Acess anywhere

    //now we can use private members into other class then use getter setter
    int getAge(){
        return this.age;
    }
    void setAge(int age){
        this.age = age;
    }
    //this is the way to get and set private into other classes.
    //-------End


}
