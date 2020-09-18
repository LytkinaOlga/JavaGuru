package by.bntu.fitr.poisit.lytkina.bean;

import java.util.Objects;

public class Parrot extends Bird{
    private String name;

    public Parrot(int countOfLegs, boolean canSwim, String color, String beakColor, String name) {
        super(countOfLegs, canSwim, color, beakColor);
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Parrot parrot = (Parrot) o;
        return Objects.equals(name, parrot.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Parrot{" +
                "name='" + name + '\'' +
                ", beakColor='" + beakColor + '\'' +
                ", countOfLegs=" + countOfLegs +
                ", canSwim=" + canSwim +
                ", color='" + color + '\'' +
                '}';
    }



    public String speak(){
        return "Hello! I am " + this.name;
    }
}
