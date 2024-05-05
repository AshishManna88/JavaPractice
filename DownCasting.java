class Vechicle {
    void start(){
        System.out.println("Started Vechicle");
    }
}
class Car extends Vechicle{
    @Override
    void start(){
        System.out.println("Car Started");
    }
}
class Plane extends Vechicle{
    @Override
    void start(){
        System.out.println("Plan Started");
    }
}



class Main{
    public static void main(String[] args) {
        Vechicle car = new Car();
        Vechicle plane = new Plane();
        demo(car);
        demo(plane);
    }
    public static void demo(Vechicle veh){
        veh.start();
    }
}