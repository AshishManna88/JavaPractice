package demo.packages1;

public class MyJavaClass {

    public String name;

    public int age;

    private String Address;

    String gender;

    // blank cubstructor
    public MyJavaClass() {
    }

    // Constructor with all argument
    public MyJavaClass(String name, int age, String address, String gender) {
        this.name = name;
        this.age = age;
        Address = address;
        this.gender = gender;
    }

    
    @Override
    public String toString(){
        return "Name: " + name +
                ", Age: "+ age;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
    
}
