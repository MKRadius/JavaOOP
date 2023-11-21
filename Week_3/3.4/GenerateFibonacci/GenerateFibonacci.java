import java.math.BigInteger;
import java.io.*;

public class GenerateFibonacci {
    public static void main(String[] args) {
        BigInteger[] fibonacci = new BigInteger[100]; // Use BigInteger instead of long to store fibonacci numbers

        fibonacci[0] = BigInteger.ZERO;
        fibonacci[1] = BigInteger.ONE;

        for (int i = 2; i < 100; i++) {
            fibonacci[i] = fibonacci[i - 1].add(fibonacci[i - 2]);
        }

        try {
            FileWriter fileWriter = new FileWriter("fibonacci.csv");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for (int i = 0; i < 100; i++) {
                bufferedWriter.write(fibonacci[i].toString());
                if ((i + 1) % 10 == 0) {
                    bufferedWriter.newLine();
                }
                else bufferedWriter.write(";");
            }
            
            bufferedWriter.close();

            System.out.println("File created at: " + new File("fibonacci.csv").getAbsolutePath());
            System.out.println("Content has been written to the file.");
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}
