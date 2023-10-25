import java.util.Scanner;

public class genPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Generating prime numbers...");

        System.out.print("Input start: ");
        String start = scanner.next();

        System.out.print("Input end: ");
        String end = scanner.next();

        if (isNumber(start) && isNumber(end)) {
            int startNum = Integer.parseInt(start);
            int endNum = Integer.parseInt(end);

            if (startNum < 0 && endNum <= 0) {
                System.out.println("Cannot generate negative number");
            }
            else if (startNum == 0 && endNum == 0) {
                System.out.println("0 is not a prime number");
            }
            else if (startNum == 1 && endNum == 1) {
                System.out.println("1 is not a prime number");
            }
            else if (startNum <= endNum) {
                System.out.print("Prime numbers from " + startNum + " to " + endNum + ":");

                if (startNum < 2) {
                    startNum = 2;
                }

                for (int i = startNum; i <= endNum; i++) {
                    boolean isPrimeNum = isPrime(i);

                    if (isPrimeNum) {
                        System.out.print(" " + i);
                    }
                }
            }
            else {
                System.out.println("Start number must be smaller than end number");
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

    public static boolean isPrime(int num) {
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
