public class Shape {
    public double calculateArea() {
        return 0.0;
    }

    public String printProperties() {
        return "";
    }

    public String getColor() {
        return "";
    }

    public String printArea() {
        double area = calculateArea();
        String str = String.format("%.3f", area);
        int index = str.indexOf(".");

        if (str.substring(index + 1).equals("000")) {
            return String.format("%.1f", area);
        }
        else {
            return Double.toString(area);
        }
    }
}
