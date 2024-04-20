import java.util.Scanner;

public class MinWithTarnary {
    public static void main(String[] args) {
        System.out.println("Minimum number find with tarnary Operator");

        Scanner st = new Scanner(System.in);

        int firstNumber = st.nextInt();
        System.out.println("First Number is: " + firstNumber);

        int secondNumber = st.nextInt();
        System.out.println("second Number is: " + secondNumber);

        MinWithTarnary mwt = new MinWithTarnary();
        int minNumChecker = mwt.minCheck(firstNumber, secondNumber);

        System.out.println("Minimun Number is : " + minNumChecker);
    }

    public int minCheck(int firstNumber, int secondNumber) {
        int minNumChecker = (firstNumber < secondNumber)?firstNumber:secondNumber;
        return minNumChecker;
    }
}
