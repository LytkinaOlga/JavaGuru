package by.bntu.fitr.poisit.lytkina;

public class PhraseAnalyser {
    public String analyze(String text){
        String answer;
        if (text.startsWith("Make") && text.endsWith("great again")){
            answer = "It stands no chance";
        }else if (text.startsWith("Make") || text.endsWith("great again")){
            answer = "It could be worse";
        } else answer = "It is fine, really";
        return  answer;
    }
}
