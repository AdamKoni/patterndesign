package builder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pizza {
    private String name;
    private List<String> toppings;
    private int size;
    private double price;

    private Pizza(PizzaBuilder pizzaBuilder) {
        name = pizzaBuilder.name;
        toppings = pizzaBuilder.toppings;
        size = pizzaBuilder.size;
        price = pizzaBuilder.price;
    }

    public static class PizzaBuilder {
        private String name;
        private List<String> toppings = new ArrayList<>();
        private int size;
        private double price;

        public PizzaBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public PizzaBuilder setToppings(String... toppings) {
            this.toppings.addAll(Arrays.asList(toppings));
            return this;
        }

        public PizzaBuilder setSize(int size) {
            this.size = size;
            return this;
        }

        public PizzaBuilder setPrice(double price) {
            this.price = price;
            return this;
        }

        public Pizza make() {
            return new Pizza(this);
        }
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", toppings='" + toppings + '\'' +
                ", size=" + size +
                ", price=" + price +
                '}';
    }
}
