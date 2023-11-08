import java.util.ArrayList;
import java.util.List;

public class ShapeCalculator {
    public static boolean areTwoShapesCompatible(Shape s1, Shape s2) {
        return s1.getClass().equals(s2.getClass());
    }

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

        System.out.println(shapes.get(2).getClass().getName() + " 2 is " + (areTwoShapesCompatible(shapes.get(2), shapes.get(3)) ? "compatible" : "not compatible") +" with " + shapes.get(3).getClass().getName() + " 3");
        System.out.println(shapes.get(2).getClass().getName() + " 2 is " + (areTwoShapesCompatible(shapes.get(2), shapes.get(0)) ? "compatible" : "not compatible") +" with " + shapes.get(0).getClass().getName() + " 0");

    }
}
