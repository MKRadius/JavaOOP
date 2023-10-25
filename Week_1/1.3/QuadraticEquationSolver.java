import java.util.Scanner;

public class QuadraticEquationSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String aInput, bInput, cInput;

        System.out.println("Solving ax^2 + bx + c = 0 equation...");
        
        System.out.print("Input a: ");
        aInput = scanner.next();
        
        System.out.print("Input b: ");
        bInput = scanner.next();

        System.out.print("Input c: ");
        cInput = scanner.next();

        if (isNumber(aInput) && isNumber(bInput) && isNumber(cInput)) {
            double a = Double.parseDouble(aInput);
            double b = Double.parseDouble(bInput);
            double c = Double.parseDouble(cInput);
            double delta = b*b - 4*a*c;

            if (delta > 0) {
                double x1 = (-b + Math.sqrt(delta))/(2*a);
                double x2 = (-b - Math.sqrt(delta))/(2*a);

                System.out.println("Two real roots x1 = " + formatNumber(x1) + " and x2 = " + formatNumber(x2));
            }
            else if (delta == 0) {
                double x = (-b + Math.sqrt(delta))/(2*a);

                System.out.println("Only one real root x = " + formatNumber(x));
            }
            else {
                System.out.println("No real roots");
            }

        }
        else {
            System.out.println("Invalid input");
        }

        scanner.close();
    }

    public static boolean isNumber(String str) {
        try {
            Double.parseDouble(str);
            return true;
        }
        catch (NumberFormatException e) {
            return false;
        }
    }

    public static String formatNumber(double num) {
        if ((num - Math.floor(num)) < 0.1) {
            return Integer.toString((int) num);
        }
        else return String.format("%.3f", num);
    }
}