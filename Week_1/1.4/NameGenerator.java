import java.util.Scanner;

public class NameGenerator {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String fInput, lInput;
        int fNum, lNum;
        String genInput;
        int genNum;

        System.out.print("How many firstnames do you want to input? - ");
        fInput = scanner.next();

        System.out.print("How many lastnames do you want to input? - ");
        lInput = scanner.next();

        if (!isIntNumber(fInput) && !isIntNumber(lInput)) {
            System.out.print("Invalid input.");
            scanner.close();
            return;
        }

        fNum = Integer.parseInt(fInput);
        lNum = Integer.parseInt(lInput);

        String[] names = generateNames(fNum, lNum);
        // https://stackoverflow.com/questions/13042008/java-util-nosuchelementexception-scanner-reading-user-input 

        while (true) {
            System.out.print("How many names do you want to generate? (Max " + fNum * lNum + ") - ");
            genInput = scanner.next();

            if (!isIntNumber(genInput)) {
                System.out.println("Invalid input.");
                continue;
            }

            genNum = Integer.parseInt(genInput);            

            if (genNum > fNum * lNum) {
                System.out.println("Cannot generate " + genNum + " names. (Max "+ fNum * lNum +")");
            }
            else if (genNum <= 0) {
                System.out.print("Exit.");
                break;                    
            }
            else {
                for (int i = 0; i < genNum; i++) {
                    System.out.println((i + 1) + ". " + names[i]);
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

    public static String[] generateNames(int numberOfFirstNames, int numberOfLastNames) {
        int k = 0;
        String[] fNames = new String[numberOfFirstNames];
        String[] lNames = new String[numberOfLastNames];
        String[] arrNames = new String[numberOfFirstNames * numberOfLastNames];

        for (int i = 0; i < numberOfFirstNames; i++) {
            System.out.print("F-" + (i + 1) + ": ");
            fNames[i] = scanner.next();
        }

        for (int i = 0; i < numberOfLastNames; i++) {
            System.out.print("L-" + (i + 1) + ": ");
            lNames[i] = scanner.next();
        }

        for (int i = 0; i < numberOfFirstNames; i++) {
            for (int j = 0; j < numberOfLastNames; j++) {
                arrNames[k++] = fNames[i] + " " + lNames[j];
            }
        }

        return arrNames;
    }
}