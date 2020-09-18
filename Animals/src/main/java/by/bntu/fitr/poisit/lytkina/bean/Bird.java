package by.bntu.fitr.poisit.lytkina.bean;

public abstract class Bird extends Animal{
    public String beakColor;

    public Bird(int countOfLegs, boolean canSwim, String color, String beakColor) {
        super(countOfLegs, canSwim, color);
        this.countOfLegs = 2;
        this.beakColor = beakColor;
    }
    
    public String fly(){
        return "I am flying";
    }

    @Override
    public String voice() {
        return "kurlyk-kyrlyk";
    }
}
