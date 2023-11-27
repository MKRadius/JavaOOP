class PrintNumber extends Thread {
    private String type;
    private int range;

    public PrintNumber(String type, int range) {
        this.type = type;
        this.range = range;
    }

    public void run() {
        if (this.type == "odd") {
            for (int i = 1; i <= range; i+= 2) {
                System.out.println("Odd thread: " + i);
            }
        }
        else if (this.type == "even") {
            for (int i = 2; i <= range; i+= 2) {
                System.out.println("Even thread: " + i);
            }
        }
        else {
            for (int i = 1; i <= range; i++) {
                System.out.println("General thread: " + i);
            }
        }
    }
}

public class MultiThreadNumberPrinting {
    public static void main(String[] args) {
        int range = 20;

        PrintNumber odd = new PrintNumber("odd", range);
        PrintNumber even = new PrintNumber("even", range);

        odd.start();
        even.start();
    }
}
