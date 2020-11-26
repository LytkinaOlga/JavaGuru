package by.bntu.fitr.poisit.lytkina.decorator.coffeelike;

public class Cappuchino extends Coffee {
    public Cappuchino(String name, double price) {
        super(name, price);
    }

    @Override
    public double getCost() {
        return price;
    }

}
