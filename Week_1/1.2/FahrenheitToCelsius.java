import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input degree in Fahrenheit: ");
        String input = scanner.nextLine();

        if (isNumber(input)) {
            float fTemp = Float.parseFloat(input);
            float cTemp = (fTemp - 32) * 5 / 9;

            System.out.println(fTemp + " F degree -> " + String.format("%.1f", cTemp) + " C degree");
        }
        else {
            System.out.println("Invalid input");
        }

        scanner.close();
    }

    public static boolean isNumber(String str) {
        try {
            Float.parseFloat(str);
            return true;
        }
        catch (NumberFormatException e) {
            return false;
        }
    }
}