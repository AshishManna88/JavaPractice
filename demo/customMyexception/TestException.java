package demo.customMyexception;

public class TestException {
    public static void main(String[] args) {
        CustomExceptionProgramme cusExcp = new CustomExceptionProgramme("AshishError");
        double res = 0;
        try{
            res = 10/0;
        }catch(Exception c){
            System.out.println("Error is : "+ cusExcp.getMessage());
        }
    }
}
