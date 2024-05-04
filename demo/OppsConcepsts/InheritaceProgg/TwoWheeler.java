package demo.OppsConcepsts.InheritaceProgg;

public class TwoWheeler extends Vechicle{
    public static String bike(){
        return "Bike";
    }
    public static String cycle(){
        return "Cycle";
    }
    public static void main(String[] args) {
        Vechicle veh = new Vechicle();
        veh.noOfTyres = 3;
        veh.setNoOfGates(0);
        veh.getNoOfGates();
        veh.start();
        System.out.println(bike() + " " + veh.getNoOfGates());
        System.out.println(cycle() + " " + veh.getNoOfGates());
    }
}
