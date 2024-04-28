package demo.sorting;

public class SelectionSort {
    
    public static void main(String[] args) {
        int[] newArray = BubbleSort.getArray(8);
        System.out.println("\nYour Array is: ");
        BubbleSort.printArray(newArray);
        
        System.out.println("\nYour Sorted Array is: ");
        int[] sortArray = selectionSort(newArray);
        BubbleSort.printArray(sortArray);

    }
    static int[] selectionSort(int[] newArray){
        for (int i = 0; i < newArray.length-1; i++) {
            int small = i;
            for (int j = i+1; j < newArray.length; j++) {
                if(newArray[small]> newArray[j]){
                    small = j;
                }
            }
            
            int temp = newArray[small];
            newArray[small] = newArray[i];
            newArray[i] = temp;
        }
        return newArray;
    }
}
