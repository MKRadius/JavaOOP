public class Triangle extends Shape {
    private double a, b, c;
    private String color;

    public Triangle(double base, double height, String color) {
        this.a = base;
        this.b = height;
        this.color = color;
    }

    public Triangle(double a, double b, double c, String color) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    @Override
    public String printProperties() {
        if (c == 0) {
            return "base " + a + " and height " + b;
        }
        else {
            return "sides " + a + ", "+ b + ", "+ c;
        }
    }
    
    @Override
    public double calculateArea() {
        if (c == 0) {
            return (a * b) / 2;
        }
        else {
            double s = (a + b + c) / 2;
            return Math.sqrt(s * (s - a) * (s - b) * (s - c));
        }
    }
}
