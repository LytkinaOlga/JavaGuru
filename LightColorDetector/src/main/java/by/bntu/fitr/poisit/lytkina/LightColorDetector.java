package by.bntu.fitr.poisit.lytkina;

public class LightColorDetector {
    public String detect(int waveLength) {
        String answer;
        if (waveLength>=380 && waveLength<=449){
            answer = "Violet";
        }else if (waveLength >= 450 && waveLength <= 494){
            answer = "Blue";
        }else if (waveLength >= 495 && waveLength <= 569){
            answer = "Green";
        }else if (waveLength >= 570 && waveLength <= 589){
            answer = "Yellow";
        }else if (waveLength >= 590 && waveLength <= 619){
            answer = "Orange";
        }else if (waveLength >= 620 && waveLength <= 750){
            answer = "Red";
        }else {
            answer = "Invisible light";
        }
        return answer;
    }
}
