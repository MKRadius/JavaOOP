import java.util.ArrayList;
import java.util.List;

public class ShapeCalculator {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();

        shapes.add(new Circle(7));
        shapes.add(new Rectangle(5, 7));
        shapes.add(new Triangle(4, 8));
        shapes.add(new Triangle(3, 4, 6));
        

        for (Shape shape : shapes) {
            System.out.print("Area of " + shape.getClass().getName() + " with " + shape.printProperties() + ": ");
            System.out.println(shape.printArea());
        }
    }
}
