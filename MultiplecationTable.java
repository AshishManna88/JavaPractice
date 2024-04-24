import java.util.Scanner;

public class MultiplecationTable {
    public static void main(String[] args) {
        System.out.println("Welcome Table program");
        Scanner st = new Scanner(System.in);
        int inputNumber = st.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(inputNumber + " * " + i + " = " + (inputNumber * i));
        }
    }
}
