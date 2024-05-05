public class ConstructorPractice {
    private int id;
    private int age;
    private String name;
    private String address;

    ConstructorPractice(){}
    public ConstructorPractice(int id, int age, String name, String address) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.address = address;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    @Override
    public String toString() {
        return "ConstructorPractice [id=" + id + ", age=" + age + ", name=" + name + ", address=" + address + "]";
    }

    
}

/**
 * InnerConstructorPractice
 */
class InnerConstructorPractice {
    public static void main(String[] args) {
        ConstructorPractice construc = new ConstructorPractice();
        construc.setAddress("hdgds kjdahfjk h");
        construc.setId(1);
        construc.setName("jhasgdd");
        construc.setAge(12);

        ConstructorPractice construc1 = new ConstructorPractice(2, 23, "fsdfsdf", "dfsdfsdfs");

        System.out.println(construc);
        System.out.println(construc1);
    }
    
}
