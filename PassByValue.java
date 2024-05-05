public class PassByValue {
    private int a;
    private int b;

    public static int add(int a, int b){
        return a+b;
    }
}

class PassByRefference{
    public static int x = 10;
    public static int y = 2;

    PassByRefference(int x, int y){
        this.x = x++;
        this.y = y++;
    }
    public void print(){
        
        System.out.printf("Now first Number is %d and second number is %d.", this.x, this.y);
    }

}

class TestPassByValue{
    public static void main(String[] args) {
        System.out.println(PassByValue.add(10,20));

        PassByRefference p = new PassByRefference(12, 20);
        p.print();
        
    }
}
