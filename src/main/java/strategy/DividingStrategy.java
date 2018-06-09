package strategy;

public class DividingStrategy implements Strategy {
    @Override
    public double operation(double firstNumber, double secondNumber) {
        if (secondNumber == 0) {
            System.out.println("Pamiętaj cholero, nie dziel przez zero");
            return 0;
        } else
        return firstNumber / secondNumber;
    }
}
