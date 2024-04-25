package demo.chalenges79;

public class TestEmployee {


    public static void main(String[] args) {
        Employee emp = new Employee("Ashish", 30, 126000);
        emp.setName("Ashish Manna");
        System.out.println(emp.getName());
        System.out.println(emp.displayEmployeeDetails());
    }
}
