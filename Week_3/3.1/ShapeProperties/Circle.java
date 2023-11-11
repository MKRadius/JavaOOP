public class Circle extends Shape {
    private double radius;
    private String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return this.radius;
    }
    
    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }
    
    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String printProperties() {
        return "radius " + radius;
    }
}
