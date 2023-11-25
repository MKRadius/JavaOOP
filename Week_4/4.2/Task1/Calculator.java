public class Calculator {
    private int value;

    public Calculator() {
        this.value = 0;
    }

    public int getValue() {
        return this.value;
    }

    public void add(int number) {
        this.value += number;
    }
    
    public void reset() {
        this.value = 0;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        while (true) {
            System.out.println("Current value: " + calculator.getValue());
            System.out.println("Input 'reset' to reset value");
            System.out.println("Input nothing to exit");
            System.out.print("Input: ");

            String input = System.console().readLine();

            // If input is empty, break the loop
            if (input.equals("")) {
                break;
            }

            // If input is "reset", reset the value
            if (input.equals("reset")) {
                calculator.reset();
                continue;
            }

            try {
                int number = Integer.parseInt(input);
                
                // If number is negative, throw exception
                if (number < 0) {
                    throw new NumberFormatException();
                }
                else calculator.add(number);
                
            } catch (NumberFormatException e) {
                System.out.println("Invalid input!");
            }

            System.out.println();
        }
    }
}
