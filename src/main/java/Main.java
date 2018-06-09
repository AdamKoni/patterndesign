import builder.Pizza;
import facade.Facade;
import factory.Document;
import factory.DocumentFactory;
import factory.DocumentType;
import observer.Person;
import observer.Weather;
import singleton.User;
import strategy.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        facade();
//        strategy();
//        singleton2();
//        singleton();
//        builder();
//        factory();
        observer();



    }

    private static void observer() {
        Weather weather = new Weather();

        Person person1 = new Person("John", 10);
        Person person2 = new Person("Tom", 15);
        Person person3 = new Person("Peter", 30);

        weather.addObservers(person1,person2,person3);
        Scanner in = new Scanner(System.in);

        while(true) {
            System.out.println("Podaj temp w 'C': ");
            int actuallTempreature = in.nextInt();
            weather.setCurrentTemperature(actuallTempreature);
        }

    }

    private static void factory() {
        DocumentFactory factory = new DocumentFactory();
        String text = "Test tekstu \n Więcej tekstu";
        Document document = factory.createDocument(text, DocumentType.TXT);
        document.writeFile();

        Document documentHtml = factory.createDocument(text,DocumentType.HTML);
        documentHtml.writeFile();
    }

    private static void builder() {
        Pizza pizza = new Pizza.PizzaBuilder()
                .setName("Hawajska")
                .setToppings("Ananas")
                .setToppings("Szynka", "Ser", "Pomidor")
                .setSize(50)
                .setPrice(25)
                .make();
        System.out.println(pizza.toString());
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
