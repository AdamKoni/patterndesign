package strategy;

public class SubstractionStrategy implements Strategy {
    @Override
    public double operation(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }
}
