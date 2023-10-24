public class Task_1_2 {
    public static void main(String[] args) {

        int height = 4;
        
        for (int i = 0; i <= (height - 1); i++) {
            for (int j = (height - 1); j >= i ; j--) {
                System.out.print(" ");
            }

            for (int j = 0; j < (2*i + 1); j++) {
                System.out.print("*");
            }

            System.out.println("");
        }
    }
}