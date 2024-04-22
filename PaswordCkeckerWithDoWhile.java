import java.util.Scanner;
public class PaswordCkeckerWithDoWhile {
    public static void main(String[] args) {
        int num = 5;
        int i = 0;
        Scanner st = new Scanner(System.in);
        String inputNumber = "";
        do {
            System.out.println("Enter a Password: ");
            inputNumber = st.nextLine();
            System.out.println("Pasword is" + (passwordChecker(inputNumber) ? " correct": " wrong"));
            i++;
        } while (!passwordChecker(inputNumber));
        
    }
    public static boolean passwordChecker(String inputPassword){

        return (inputPassword.length() > 6);
    }
}
