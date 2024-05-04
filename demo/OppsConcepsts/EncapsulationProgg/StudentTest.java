package demo.OppsConcepsts.EncapsulationProgg;

public class StudentTest {
    public static void main(String[] args) {
        Student stu1 = new Student();
    
        stu1.setStuId(001);
        stu1.setStuName("Ashish");
        stu1.setMarks(80);
        stu1.setMarks(82);
        stu1.setMarks(84);
        stu1.setMarks(86);
        stu1.setMarks(88);
        
        System.out.printf("Student ID: %d \n", stu1.getStuId());
        System.out.printf("Student Name: %s \n", stu1.getStuName());
        System.out.println("Student Marks: " + stu1.getMarks());
    }

}
