package demo.OppsConcepsts.InheritaceProgg;

class Shape {
    void getArea(){
        System.out.println("Area of any shape");
    }
}

class Rectangle extends Shape{
    @Override
    void getArea(){
        int length = 10;
        int width = 20;
        System.out.printf("Area of Rectangle is: %d", length*width);
    }
}

/**
 * 3.Shape
 */
class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Rectangle rectangle = new Rectangle();

        shape.getArea();
        rectangle.getArea();
    }
    
}
