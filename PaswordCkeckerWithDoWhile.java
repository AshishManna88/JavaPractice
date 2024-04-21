import java.util.Scanner;
public class PaswordCkeckerWithDoWhile {
    public static void main(String[] args) {
        boolean passCheck;
        int i = 0;
        do {
            Scanner st = new Scanner(System.in);
            String inputPassword = st.nextLine();
            passCheck = passwordChecker(inputPassword);
            if (passCheck) {
                System.out.println("Correct Password");
                break;
            } else {
                System.out.println("wrong password");
                i++;
            }
        } while (true);
        
    }
    public static boolean passwordChecker(String inputPassword){

        return (inputPassword.length() > 6);
    }
}
