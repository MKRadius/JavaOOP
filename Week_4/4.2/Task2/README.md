# Code Description

### Explanation of the code:

### 1. Class initialization:
```java
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

    //...
}
```

- The Calculator class has three methods: `getValue`, `add` and `reset`. The class also has a private int variable called `value`. The `value` variable is used to store the current value of the calculator.

- The constructor initializes the `value` variable to 0.

- The `getValue` method returns the current value of the calculator.

- The `add` method adds the given number to the value.

- The `reset` method resets the value to 0.



### 2. Main method:
```java
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
```

- The `main` method creates a new `Calculator` object and stores it in the calculator variable.

- The main method then enters a while loop that runs until the user inputs an empty string.

- Inside the while loop, the current value of the calculator is printed to the user.

- The user is then asked to input a number or the word "reset" or nothing.

    - If the user inputs an empty string, the while loop is broken.

    - If the user inputs the word "reset", the calculator resets the value to 0 and the while loop continues.

    - If the user inputs a number, the number is added to the calculator.

    - If the user inputs anything else, an error message is printed and the while loop continues.

- After the while loop, the program ends.
