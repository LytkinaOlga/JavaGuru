package by.bntu.fitr.poisit.lytkina.decorator.coffeelike;

public class Chocolate extends CoffeeDecorator {
    public Chocolate(Coffee coffee) {
        super(coffee.price + 1.0, coffee);
    }
}
