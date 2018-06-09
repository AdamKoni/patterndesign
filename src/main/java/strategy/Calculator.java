package strategy;

public class Calculator {
    private Strategy strategy;

    public double calculate(double firstNumber, double secondNumber) {
        if (strategy == null) {
            System.out.println("Erro");
            return 0;
        } else {
            return strategy.operation(firstNumber, secondNumber);
        }
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
