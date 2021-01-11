package by.bntu.fitr.poisit.lytkina.decorator.coffeelike;

public abstract class Coffee {
    String name;
    double price;

    public Coffee(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public abstract double getCost();
}
