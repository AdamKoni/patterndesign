package strategy;

public class AddingStrategy implements Strategy {

    @Override
    public double operation(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }
}
