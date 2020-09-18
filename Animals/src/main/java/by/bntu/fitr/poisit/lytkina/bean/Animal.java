package by.bntu.fitr.poisit.lytkina.bean;

public abstract class Animal {
    public int countOfLegs;
    public boolean canSwim;
    public String color;


    public Animal(int countOfLegs, boolean canSwim, String color) {
        this.countOfLegs = countOfLegs;
        this.canSwim = canSwim;
        this.color = color;
    }

    public String breath(){
        return "I can breath";
    }
    
    public String voice(){
        return "I can say";
    }
}
