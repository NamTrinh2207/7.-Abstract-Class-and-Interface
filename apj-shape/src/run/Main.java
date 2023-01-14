package run;
import shape.*;
public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Shape[] shapes = new Shape[5];
        shapes[0] = new Circle(10, shape.getColor(), shape.isFilled());
        shapes[1] = new Rectangle(10,15, shape.getColor(), shape.isFilled());
        shapes[2] = new Square(10, shape.getColor(), shape.isFilled());
        shapes[3] = new Square(10, shape.getColor(), shape.isFilled());
        shapes[4] = new Circle(10, shape.getColor(), shape.isFilled());
        System.out.println("Before: ");
        for (Shape a: shapes
             ) {
            System.out.println(a);
        }
        System.out.println(" ");
        System.out.println("After: ");
        for (Shape a: shapes
             ) {
            if (a instanceof Square){
                System.out.println(a);
                a.howToColor();
            }
        }
    }
}