public class CoffeeMaker {
    public static void main(String[] args) {
        CoffeeMachine myCoffeeMaker = new CoffeeMachine("normal", 10);

        System.out.println("Coffee type: " + myCoffeeMaker.getType());

        myCoffeeMaker.changeType();
        myCoffeeMaker.switchOnOff();
        myCoffeeMaker.changeType();

        System.out.println("Coffee type: " + myCoffeeMaker.getType());

        myCoffeeMaker.changeAmount(100);
        System.out.println("Coffee amount: " + myCoffeeMaker.getAmount() + "ml");

        myCoffeeMaker.changeAmount(70);
        System.out.println("Coffee amount: " + myCoffeeMaker.getAmount() + "ml");



        myCoffeeMaker.makeCoffee();
    }
}
