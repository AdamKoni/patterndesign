import facade.Facade;
import strategy.*;

public class Main {
    public static void main(String[] args) {
//        facade();
        strategy();

    }

    private static void strategy() {
        Calculator calculator = new Calculator();

        calculator.setStrategy(new AddingStrategy());
        System.out.println(calculator.calculate(1, 2));

        calculator.setStrategy(new SubstractionStrategy());
        System.out.println(calculator.calculate(5, 2));

        calculator.setStrategy(new MultiplicationStrategy());
        System.out.println(calculator.calculate(3, 4));

        calculator.setStrategy(new DividingStrategy());
        System.out.println(calculator.calculate(10, 2));
    }

    private static void facade() {
        Facade facade = new Facade();
        facade.enterRoom();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        facade.exitRoom();
    }
}
