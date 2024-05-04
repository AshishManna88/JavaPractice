package demo.OppsConcepsts.EncapsulationProgg;

public class TestEncapsule {
    public static void main(String[] args) {
        EncapsulationPractice accessPrivateMembers = new EncapsulationPractice();
        accessPrivateMembers.id = 10; 
        //accessPrivateMembers.age = 30;            ------- Not accessable other classes
        
        // -- use privte members with getter setter
        accessPrivateMembers.setAge(30);
        accessPrivateMembers.getAge();
        //-----End

        accessPrivateMembers.name = "Ashish";
        accessPrivateMembers.address = "lkasdjljsa";

    }
}
