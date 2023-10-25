import java.util.Scanner;

public class ObsoleteMeasures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Weight (g): ");
        String input = scanner.next();

        if (isNumber(input)) {
            double grams = Double.parseDouble(input);

            double luoti = grams / 13.28;
            double naulaa = luoti / 32;
            double leiviska = naulaa / 20;

            System.out.print(input + " grams is ");
            System.out.print(((int) leiviska) + " leiviskä, ");
            System.out.print(((int) naulaa) + " naula, and ");
            System.out.println(String.format("%.2f", luoti) + " luoti.");
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