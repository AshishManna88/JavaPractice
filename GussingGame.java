import java.util.Scanner;

public class GussingGame {
    public static void main(String[] args) {
        System.out.println("Gussing game");

        int i = 0;
        do {
            Scanner st = new Scanner(System.in);
            int getInput = st.nextInt();
            if(getInput > 10){
                System.out.println("Guess Number less than 10");
            }
            int gussingNumber = gussingInput();
            if(gussingNumber == getInput){
                System.out.println("Correct Gussing you won the match");
                break;
            } else{
                System.out.println("Wrong Guess: " + "your Number is: " + getInput + " & Guessing Number is: " + gussingNumber);
                i++;
            }
        } while (true);


    }
    public static int gussingInput(){
        return (int)(Math.random()* 10)-1;
    }
}
