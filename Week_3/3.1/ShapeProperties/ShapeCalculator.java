import java.util.ArrayList;
import java.util.List;

public class ShapeCalculator {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();

        shapes.add(new Circle(7, "red"));
        shapes.add(new Rectangle(5, 7, "green"));
        shapes.add(new Triangle(4, 8, "blue"));
        shapes.add(new Triangle(3, 4, 6, "orange"));
        

        for (Shape shape : shapes) {
            System.out.print("Area of " + shape.getColor() + " " + shape.getClass().getName() + " with " + shape.printProperties() + ": ");
            System.out.println(shape.printArea());
        }
    }
}
