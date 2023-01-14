package resizeable;

public class Run {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(10, "yellow", false);
        shapes[1] = new Rectangle(10, 10, "black", true);
        shapes[2] = new Square(10, "orange", true);
        for (Shape a : shapes) {
            System.out.println(a);
        }

        System.out.println(" ");
        for (Shape a : shapes) {
            a.resize(Math.random() * 100);
            System.out.println(a);
        }

    }
}