public class SortedArray {
    public static void main(String[] args) {
        int[] arry1 = {1, 3, 5, 7, 9};
        int[] arry2 = {2, 4, 6, 8};
        int [] newArray = new int[arry1.length + arry2.length];

        
        // int i = 0, j = 0, k = 0;
        // while ((i < arry1.length || j <arry2.length)) {
        //     if (j == arry2.length || arry1[i] < arry2[j]) {
        //         newArray[k] = arry1[i];
        //         i++;
        //     } else {
        //         newArray[k] = arry2[j];
        //         j++;
        //     }
        //     k++;
        // }
        int i = 0, j = 0, k = 0;
        for (int k2 = 0; k2 < newArray.length; k2++) {
            if(j == arry2.length || arry1[i] < arry2[j]){
                newArray[k++] = arry1[i++];
            }else{
                newArray[k++] = arry2[j++];
            }
        }
        for (int kn : newArray) {
            System.out.print(kn + " ");
        }
    }
}
