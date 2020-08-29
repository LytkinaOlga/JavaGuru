package by.bntu.fitr.poisit.lytkina;

public class SignComparator {
    public String compare(int number) {
        String result = "Number is equal to zero";
        if (number > 0) {
            result = "Number is positive";
        } else if (number < 0) {
            result = "Number is negative";
        }
        return result;
    }
}
