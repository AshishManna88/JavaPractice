package demo.chalenges79;

public class Employee {
    
    private String name;
    private int age;
    private long salary;

    Employee(String name, int age, long salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    String displayEmployeeDetails(){
        StringBuilder showEmpDetail = new StringBuilder("Employee Details");
        showEmpDetail.append("\n")
        .append("Name: "+ name +",")
        .append("Age: " + age + ",")
        .append("Salary: " + salary + ".");
        return showEmpDetail.toString();
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }
    
}
