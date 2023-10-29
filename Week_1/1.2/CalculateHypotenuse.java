import java.util.Scanner;

public class CalculateHypotenuse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input leg 1: ");
        String leg1 = scanner.next();

        System.out.print("Input leg 2: ");
        String leg2 = scanner.next();

        if (isNumber(leg1) && isNumber(leg2)) {
            Double fLeg1 = Double.parseDouble(leg1);
            Double fLeg2 = Double.parseDouble(leg2);
            Double hyp = Math.sqrt(Math.pow(fLeg1, 2) + Math.pow(fLeg2, 2));

            System.out.println("The hypotenuse of the right triangle is: " + String.format("%.3f", hyp));
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
}
