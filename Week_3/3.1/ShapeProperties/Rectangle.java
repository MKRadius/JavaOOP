public class Rectangle extends Shape {
    private double a, b;
    private String color;

    public Rectangle(double a, double b, String color) {
        this.a = a;
        this.b = b;
        this.color = color;
    }

    public double getWidth() {
        return (a < b) ? a : b;
    }

    public double getHeight() {
        return (a > b) ? a : b;
    }
    
    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    @Override
    public String printProperties() {
        return "sides " + a + " and " + b;
    }
    
    @Override
    public double calculateArea() {
        return a * b;
    }
}
