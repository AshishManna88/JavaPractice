import java.util.Scanner;

public class GussingGame {
    public static void main(String[] args) {
        int num = 5;
        int i = 0;
        Scanner st = new Scanner(System.in);
        int inputNumber;
        do {
            System.out.println("Guess the Number: ");
            inputNumber = st.nextInt();
            System.out.println("Your Guessing Number is "+ (num == inputNumber?" correct":" Wrong"));
        } while (num != inputNumber);
    }
}
