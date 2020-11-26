package by.bntu.fitr.poisit.lytkina.templatemethod;

public abstract class Drink {
    public void takeGlass(){
        System.out.println("taking a glass");
    }
    public abstract void addComponent();
    public void addWater(){
        System.out.println("adding water");
    }
    public void mixAll(){
        System.out.println("mixing all");
    }
}
