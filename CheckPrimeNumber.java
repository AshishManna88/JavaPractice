import java.util.Scanner;
public class CheckPrimeNumber {
    
    public static void main(String[] args) {
        System.out.println("Welcome a program to check Prime Number");
        Scanner st = new Scanner(System.in);
        int inputNumber = st.nextInt();
        System.out.println(inputNumber+ " number is " + (primeChecker(inputNumber)? "Prime Number": "Not Prime Number"));
    }

    public static boolean primeChecker (int inputNumber) {
        for (int i = 2; i < inputNumber; i++) {
            if (inputNumber % i == 0) {
                return false;
            }
        }
        return true;
    }

}
