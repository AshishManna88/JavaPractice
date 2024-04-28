package demo.sorting;
import java.util.Scanner;

public class BubbleSort {
    private int arraySize;
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        System.out.println("Enter size of Array");
        int arraySize = st.nextInt();
        int[] newArray = getArray(arraySize);
        printArray(newArray);

    }
    static int[] getArray(int arraySize){
        int[] newArray = new int[arraySize];
        
        for (int i = 0; i < arraySize; i++) {
            newArray[i] = (int)(Math.random() * 100) + 1;
        }

        return newArray;
    }

    static void printArray(int[] newArray){
        for (int i : newArray) {
            System.out.print(i + " ");
        }
    }
}
