import java.util.Scanner;
public class OddEvenCheckWithTarnary {
    public static void main(String[] args) {
        System.out.println("Enter number for check Odd or Even Number");
        Scanner st = new Scanner(System.in);
        int inputNumber = st.nextInt();
        String str = (inputNumber % 2 == 0) ? "Even" : "Odd";
        System.out.println(inputNumber + " this number is " + str);
    }
}
