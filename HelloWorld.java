public class HelloWorld {

    private int id;
    private String name;

    public String getName(){
        return this.name;
    }
    private void setName(String name) {
        this.name = name;
    }
    HelloWorld(){
        this.id = id;
        this.name = name;
    }

    HelloWorld(int id, String name){
        this.id = id+10;
        this.name = "Hello " + name;
    }
    public static void main(String[] args) {
        System.out.println("Hello world");

        HelloWorld hw = new HelloWorld();
        hw.name = "Ashish";
        System.out.println(hw.getName());
        hw.setName("Animesh");
        System.out.println(hw.getName());

        HelloWorld hw2 = new HelloWorld(01, "Ashish Manna");
        System.out.println(hw2.getName());

    }
}
