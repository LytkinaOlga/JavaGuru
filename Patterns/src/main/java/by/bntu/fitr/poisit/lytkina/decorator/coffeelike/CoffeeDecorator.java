package by.bntu.fitr.poisit.lytkina.decorator.coffeelike;

public class CoffeeDecorator extends Coffee {
    protected Coffee coffee;

    public CoffeeDecorator(double price, Coffee coffee) {
        super(coffee.name, price);
        this.coffee = coffee;
    }

    @Override
    public double getCost() {
        return price;
    }
}
