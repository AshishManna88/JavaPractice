package demo.customMyexception;

public class CustomExceptionProgramme extends Exception{
    private String name = "";

    public CustomExceptionProgramme(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String getMessage() {
        // TODO Auto-generated method stub
        return "Kindly check the name has error";
    }

    
}
