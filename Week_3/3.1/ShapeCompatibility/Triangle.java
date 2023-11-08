public class Triangle extends Shape {
    private double a, b, c;

    public Triangle(double base, double height) {
        this.a = base;
        this.b = height;
    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
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
