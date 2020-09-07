package by.bntu.fitr.poisit.lytkina;

public class Palindrom {
    boolean isPalindrome(String text){
        boolean result = true;
        char[] textArray = text.toCharArray();

            for (int i = 0, j = textArray.length - 1; i < textArray.length/2; j--, i++){
                if (textArray[i] != textArray[j]){
                    result = false;
                }
            }

        return result;
    }
    String removeCharFromStr(String text, int ind){
        return text.substring(0, ind) + text.substring(ind + 1);        
    }
    String toLowerCase (String text){
        return text.toLowerCase();
    }
    String removeGarbage(String text){
        char[] array = {',', '.', '!', '?', '/', '*', '^', '(', ')'};
        for ( char letter : text.toCharArray()){
            for (int j = 0; j <array.length; j++){
                if (letter == array[j]){
                    int ind = text.indexOf(letter);
                    text = removeCharFromStr(text, ind);
                }
            }
        }
        return text;
    }
}
