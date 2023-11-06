public class Rectangle extends Shape {
    private double a, b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getWidth() {
        return (a < b) ? a : b;
    }

    public double getHeight() {
        return (a > b) ? a : b;
    }
    
    @Override
    public double calculateArea() {
        return a * b;
    }
}
