package by.bntu.fitr.poisit.lytkina;

public class Copy {
    public int copyInRangeReturnNewArrayLength(int[] array, int leftBound, int rightBound){

        
        int newArraySize = 0;
        
        for (int j = 0; j < array.length; j++){
            for (int i = leftBound; i<= rightBound; i++){
            
                if (array[j] == i){
                    newArraySize ++;
                }
            }
        }
        return newArraySize;
    }
    public int[] copyInRange(int[] array, int leftBound, int rightBound){

        int newArraySize = copyInRangeReturnNewArrayLength(array, leftBound, rightBound);
        int[] newArray = new int[newArraySize];
        int indNewArray = 0;

        for (int j = 0; j < array.length; j++){
            for (int i = leftBound; i<= rightBound; i++){

                if (array[j] == i){
                    newArray[indNewArray] = i;
                    indNewArray++;
                }
            }
        }        
        return newArray;
    }
}
