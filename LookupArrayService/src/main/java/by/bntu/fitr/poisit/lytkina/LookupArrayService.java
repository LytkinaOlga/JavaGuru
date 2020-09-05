package by.bntu.fitr.poisit.lytkina;

public class LookupArrayService {

    public int findMax(int[] array){
        int indMax = 0;
        if (array != null){
            for (int i = 0; i < array.length; i++){
                if (array[indMax] < array[i]){
                    indMax = i;
                }
            }
            return array[indMax];
        }
        return 0;
    }
    public int findMin(int[] array){
        int indMin = 0;
        if (array != null){
            for (int i = 0; i < array.length; i++){
                if (array[indMin] > array[i]){
                    indMin = i;
                }
            }
            return array[indMin];
        }
        return 0;
    }
    public int indexOfMax(int[] array){
        int indMax = 0;
        if (array != null){
            for (int i = 0; i < array.length; i++){
                if (array[indMax] < array[i]){
                    indMax = i;
                }
            }
            return indMax;
        }
        return -1;
    }
    public int indexOfMin(int[] array){
        int indMin = 0;
        if (array != null){
            for (int i = 0; i < array.length; i++){
                if (array[indMin] > array[i]){
                    indMin = i;
                }
            }
            return indMin;
        }
        return -1;
    }
    public int indexOf(int[] array, int value){
        if (array != null){
            for (int i = 0; i < array.length; i++){
                if (array[i] == value){
                    return i;
                }
            }
        }
        return -1;
    }
}
