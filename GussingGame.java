import java.util.Scanner;

public class GussingGame {
    public static void main(String[] args) {
        int num = 5;
        int i = 0;
        Scanner st = new Scanner(System.in);
        String inputNumber = "";
        do {
            System.out.println("Enter a Password: ");
            inputNumber = st.nextLine();
            System.out.println("Pasword is" + (numCheck(inputNumber) ? " correct": " wrong"));
            i++;
        } while (!numCheck(inputNumber));
    }
    public static boolean numCheck(String inputNumber) {
        return inputNumber.length() > 6;
    }
}
