package demo.challenges77.Utils;

import demo.challenges77.geometry.Circle;
import demo.challenges77.geometry.Rectangle;

public class Calculator {
    
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(10, 20);

        double areaOfCircle = Math.PI * Math.pow(circle.r, 2);
        long areaOfRectangle = rectangle.length * rectangle.height;

        System.out.println("Area of Circle is: " + areaOfCircle);
        System.out.println("Area of Rectangle is: " + areaOfRectangle);
    }
}
