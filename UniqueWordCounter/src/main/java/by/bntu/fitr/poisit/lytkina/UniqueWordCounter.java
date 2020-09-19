package by.bntu.fitr.poisit.lytkina;

import java.util.HashMap;
import java.util.Map;

public class UniqueWordCounter implements UniqueWordCounterI{

    @Override
    public void addWord(String word, HashMap<String, Integer> wordAndNumber) {
        if (wordAndNumber.containsKey(word)){
            int value = wordAndNumber.get(word);
            wordAndNumber.put(word, ++value);
        }else{
            wordAndNumber.put(word, 1);
        }
    }

    @Override
    public void getMostFrequentWord(HashMap<String, Integer> wordAndNumber) {
        int maxValue = 1;
        for(Map.Entry<String, Integer> map : wordAndNumber.entrySet()){
            if (map.getValue() > maxValue){
                maxValue = map.getValue();
            }
        }
        for(Map.Entry<String, Integer> map : wordAndNumber.entrySet()){
            if (map.getValue() == maxValue){
                App.logger.info(" {}  ", map.getKey());
            }
        }        
    }

    @Override
    public void printWordsFrequency(HashMap<String, Integer> wordAndNumber) {
        for(Map.Entry<String, Integer> map : wordAndNumber.entrySet()){
            App.logger.info("Word: {} ---> add {} times", map.getKey(), map.getValue());
        }

    }
}
