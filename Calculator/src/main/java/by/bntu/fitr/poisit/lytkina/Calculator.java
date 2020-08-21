package by.bntu.fitr.poisit.lytkina;

import java.util.Objects;

public class Calculator {
    int firstNumber;
    int secondNumber;

    public Calculator(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Calculator that = (Calculator) o;
        return firstNumber == that.firstNumber &&
                secondNumber == that.secondNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstNumber, secondNumber);
    }

    @Override
    public String toString() {
        return "Calculator{" +
                "firstNumber=" + firstNumber +
                ", secondNumber=" + secondNumber +
                '}';
    }

    public int Addition() {
        return firstNumber + secondNumber;
    }

    public int Multiplication(){
        return  firstNumber * secondNumber;
    }
    public int Subtraction(){
        return firstNumber - secondNumber;
    }
    public double Division(){
        double answer;
        if (secondNumber != 0){
            answer = (double)firstNumber/(double) secondNumber;
        }else answer = 0;
        return answer;
    }


}
