package by.bntu.fitr.poisit.lytkina;

public class PrimeNumbers {

    public int sumOfPrimeNumbers(){
        int sum = 0;
        int count = 0;
        for (int number = 2; number <= 500; number++) {
            if (number == 17 || number == 71) {
                continue;
            }
            if (count == 50){
                break;
            }
            sum += checkAndReturnPrimeNumber(number);
            count = calculateCountOfPrimeNumbers(number, count);
        }
        return sum;
    }
    public int checkAndReturnPrimeNumber(int number){
        boolean flag = true;
        for (int i = 2; i <= number / i; i++) {
            if (number % i == 0) {
                flag = false;
                break;
            }
        }
        if (flag) {
            return number;
        }else return  0;
    }
    public int calculateCountOfPrimeNumbers(int number, int count){
            if (checkAndReturnPrimeNumber(number) != 0){
                count ++;
            }
        return count;
    }
}
