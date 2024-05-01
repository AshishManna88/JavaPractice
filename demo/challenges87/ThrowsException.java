package demo.challenges87;

import java.util.Scanner;

public class ThrowsException {

    public static void main(String[] args) {
        
        ThrowsException te = new ThrowsException();
        te.a();
    }

    void a(){
        b();
    }
    static void b(){
        c();
    }
    static void c(){
        d();
    }
    static void d(){
        Scanner st = new Scanner(System.in);

        int firstNumber = 0;
        int secondNumber = 0;
        try{
            System.out.print("Enter First Number: ");
            firstNumber = st.nextInt();
            System.out.print("Enter Second Number: ");
            secondNumber = st.nextInt();
            double res = firstNumber / secondNumber;
        }catch(ArithmeticException a){
            System.out.println("Error in dovisible for 2 numbers"+ a.getMessage());
        }catch(Exception e){
            System.out.println("Other Exception: "+ e.getMessage());
        }finally{
            System.out.println("Your First Number is: "+ firstNumber + " Second Number is : "+ secondNumber);
        }
    }
}
