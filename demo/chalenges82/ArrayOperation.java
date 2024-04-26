package demo.chalenges82;

public class ArrayOperation {
    
    public static class Statistics{

        public void mean(int[] arry){
            double total = 0;
            for (int i : arry) {
                total += i;
            }

            System.out.println("Mean is: " + (total/(arry.length)));
        }
    }
    public static void main(String[] args) {
        int[] arry = new int[]{1,2,3,4,5};
        ArrayOperation.Statistics stats = new Statistics();

        stats.mean(arry);
    }
}
