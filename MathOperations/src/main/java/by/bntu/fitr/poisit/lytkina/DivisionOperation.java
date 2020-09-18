package by.bntu.fitr.poisit.lytkina;

public class DivisionOperation implements MathOperations{
    @Override
    public double compute(double a, double b) {
        if (b == 0 ){
            throw new NullPointerException();
        }
        return a / b;
    }
}
