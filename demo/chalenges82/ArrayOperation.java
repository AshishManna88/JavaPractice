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
        public void median(int[] arry){
            int length = arry.length;
            System.out.println((length % 2 == 0? arry[((length/2)+(length+1)/2)/2]:arry[(length+1)/2]));
        }
    }
    public static void main(String[] args) {
        int[] arry = new int[]{1,2,3,4,5,3};
        ArrayOperation.Statistics stats = new Statistics();

        stats.mean(arry);
        stats.median(arry);
    }
}
