package demo.OppsConcepsts.InheritaceProgg;

public class FourWheeler extends Vechicle{
    public static String car(){
        return "Car";
    }
    public static void main(String[] args) {
        Vechicle veh = new Vechicle();
        veh.start();
        System.out.println(car() + " Started");
    }
}
