package by.bntu.fitr.poisit.lytkina.bean;

public abstract class Mammal extends Animal{

    public Mammal(int countOfLegs, boolean canSwim, String color) {
        super(countOfLegs, canSwim, color);
    }

    public String run(){
        return "I can run";
    }

}
