package by.bntu.fitr.poisit.lytkina.bean;

import java.util.Objects;

public class Dog extends Mammal{
    private String dogBreed;

    public Dog(int countOfLegs, boolean canSwim, String color, String dogBreed) {
        super(countOfLegs, canSwim, color);
        this.dogBreed = dogBreed;
    }

    public String getDogBreed() {
        return dogBreed;
    }

    public void setDogBreed(String dogBreed) {
        this.dogBreed = dogBreed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(dogBreed, dog.dogBreed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dogBreed);
    }

    @Override
    public String toString() {
        return "Dod{" +
                "dogBreed='" + dogBreed + '\'' +
                ", countOfLegs=" + countOfLegs +
                ", canSwim=" + canSwim +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public String voice() {
        return "hau-hau";
    }

    public String wagTail(){
        return "I am wagging a tail";
    }

}
