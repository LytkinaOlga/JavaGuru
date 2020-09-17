package by.bntu.fitr.poisit.lytkina.bean;

import java.util.Objects;

public class Cat extends Mammal{
    private String name;

    public Cat(int countOfLegs, boolean canSwim, String color, String name) {
        super(countOfLegs, canSwim, color);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", countOfLegs=" + countOfLegs +
                ", canSwim=" + canSwim +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public String voice() {
        return "mua - mua";
    }

    public String drinkMilk(){
        return "I like drinking milk";
    }
}
