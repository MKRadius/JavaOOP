public class TestClock {
    public static void main(String[] args) {
        Clock clock = Clock.getInstance();

        System.out.println("Current time: " + clock.getClock());

        clock.setClock(100);
        System.out.println("Current time: " + clock.getClock());
    }
}
