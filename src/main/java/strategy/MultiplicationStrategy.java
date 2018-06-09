package strategy;

public class MultiplicationStrategy implements Strategy {
    @Override
    public double operation(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }
}
