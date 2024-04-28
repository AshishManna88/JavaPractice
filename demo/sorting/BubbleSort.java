package demo.sorting;
import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    private int arraySize;
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        System.out.println("Enter size of Array");
        int arraySize = st.nextInt();
        int[] newArray = getArray(arraySize);

        //Arrays.sort(newArray);
        //System.out.println(Arrays.toString(newArray));

        System.out.println("\nYour Array is: ");
        printArray(newArray);
        
        System.out.println("\nYour Sorted Array is: ");
        int[] sortedArray = sortArray(newArray);
        printArray(sortedArray);

    }
    static int[] getArray(int arraySize){
        int[] newArray = new int[arraySize];
        
        for (int i = 0; i < arraySize; i++) {
            newArray[i] = (int)(Math.random() * 100) + 1;
        }

        return newArray;
    }

    static void printArray(int[] newArray){
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i]);
            if (i < newArray.length - 1) {
                System.out.print(",");
            }
        }

        boolean first = true;
        for (int i : newArray) {
            if (!first) {
                System.out.print(",");
            } else {
                first = false;
            }
            System.out.print(i);
        }
    }

    static int[] sortArray(int[] newArray){
        for (int i = 0; i < newArray.length-1; i++) {
            for (int j = i+1; j < newArray.length; j++) {
                if(newArray[i] > newArray[j]){
                    newArray[i] = newArray[i] + newArray[j]; //a = a+b; a=10, b=20
                    newArray[j] = newArray[i] - newArray[j]; //b = a-b 30-20
                    newArray[i] = newArray[i] - newArray[j]; //a = a - b 30-10
                }
            }
        }
        return newArray; 
    } 
}
