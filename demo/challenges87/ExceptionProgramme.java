package demo.challenges87;
import java.util.Scanner;

public class ExceptionProgramme extends Exception{


    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        System.out.println("Enter first Number");
        int firstNumber = st.nextInt();
        System.out.println("Enter Second Number");
        int secondNumber = st.nextInt();
        System.out.println(divideFunc(firstNumber, secondNumber));
        
    }

    public static double multiplicationFunc(int f, int s){
        try{
            
        } catch(Exception e){
            System.out.println("");
        }
        return 1;
    }

    public static double divideFunc(int f, int s){
        double r = 0;
        try{
            r = (f / s);
        } catch(ArithmeticException e){
            System.out.println("Expetion is: " + e.getMessage());
        }
        return r;
    }
}
