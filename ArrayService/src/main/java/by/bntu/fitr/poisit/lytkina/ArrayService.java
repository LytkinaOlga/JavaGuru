package by.bntu.fitr.poisit.lytkina;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.Random;


public class ArrayService {

    Logger logger = LoggerFactory.getLogger(ArrayService.class);
    Random random = new Random();


    public int[] create(int size) {
        return new int[size];
    }

    public void fillRandomly(int[] array) {

        if (array != null) {
            for (int i = 0; i < array.length; i++) {
                array[i] = random.nextInt(100);
            }
        }
    }

    public void printArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            logger.info("array[{}] = {}", i, array[i]);
        }
    }

    public int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public double avg(int[] array) {
        double avg = 0;
        if (array != null) {
            avg = (double) sum(array) / array.length;
        }
        return avg;
    }

    public void sort(int[] array) {
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                }

            }
        }
    }
    public void swap(int[] array){
        for (int i = 0, j = array.length - 1; i < array.length / 2; i++, j--){
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}
