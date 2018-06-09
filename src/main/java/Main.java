import facade.Facade;
import singleton.User;
import strategy.*;

public class Main {
    public static void main(String[] args) {
//        facade();
//        strategy();
//        singleton2();
//        singleton();
        

    }

    private static void singleton2() {
        User user = User.getInstance();
        user.setAge(16);
        user.setName("Michał");
    }

    private static void singleton() {
        User user = User.getInstance();
        System.out.println(user.toString());
        System.out.println(user.hashCode());
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
