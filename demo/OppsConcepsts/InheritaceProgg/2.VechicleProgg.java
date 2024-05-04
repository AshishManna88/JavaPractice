package demo.OppsConcepsts.InheritaceProgg;

class Vechicledemo {
    void drive(){
        System.out.println("Drive a Vechicle");
    }
}
/**
 * 2.VechicleProgg
 */
class Car extends Vechicledemo {
    @Override
    void drive(){
        System.out.println("Reparing a Car");
    }
}

/**
 * 2.VechicleProgg
 */
class Main {
    public static void main(String[] args) {
        Vechicledemo veh = new Vechicledemo();
        Car car = new Car();

        veh.drive();
        car.drive();
    }
    
}