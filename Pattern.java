public class Pattern {
    public static void firstPattern(){
        System.out.println("First pattern");

        int rows = 1;
        while (rows <= 5) {
            int cols = 1;
            while (cols <= rows) {
                System.out.print("*");
                cols++;
            }
            System.out.println("");
            rows++;
        }
    }
    public static void main(String[] args) {
        secondPattern();
    }

    public static void secondPattern(){
        System.out.println("Second Pattern");
        int rowSpace = 1;
        while(rowSpace < 6){
            int colSpace = 5;
            int colStar = 1;
            while (colSpace > rowSpace) {
                System.out.print(" ");
                colSpace--;
            }
            while (colStar <= rowSpace) {
                System.out.print("*");
                colStar++;
            }
            
            System.out.println("");
            rowSpace++;
        }

    }
}
