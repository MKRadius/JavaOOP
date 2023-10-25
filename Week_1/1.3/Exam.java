import java.util.Scanner;
import java.util.Random;

public class Exam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        String input;
        int a = 0, b = 0, ans = 0, problems = 0, point = 0;

        System.out.println("Multiplication table exam...");

        while (problems < 10 || point < 10) {

            a = rand.nextInt(10) + 1;
            b = rand.nextInt(10) + 1;

            System.out.print("Q." + (problems + 1) + ": ");
            System.out.print(a + " x " + b + " = ");
            input = scanner.next();

            if (isIntNumber(input)) {
                ans = Integer.parseInt(input);

                if (a*b == ans) {
                    System.out.println("Correct.");
                    point++;
                }
                else {
                    System.out.println("Incorrect.");
                }
            }
            else {
                System.out.println("Invalid input. No point.");
            }

            problems++;

            if (problems == 10) {
                System.out.println("Your score is " + point + "/10.");

                if (point < 10) {
                    System.out.println("You did not complete all the problems correctly.");
                    System.out.println("You have to retake the exam.");
                    problems = 0;
                    point = 0;
                    scanner.nextLine();
                }
                else if (point == 10) {
                    System.out.println("Congratulations! You completed all the problems correctly.");
                    scanner.nextLine();
                    break;
                }
            }
        }

        scanner.close();
    }

    public static boolean isIntNumber(String str) {
        try {
            Integer.parseInt(str);
            return true;
        }
        catch (NumberFormatException e) {
            return false;
        }
    }
}
