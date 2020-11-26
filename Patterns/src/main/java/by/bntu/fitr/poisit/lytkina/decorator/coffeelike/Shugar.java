package by.bntu.fitr.poisit.lytkina.decorator.coffeelike;

public class Shugar extends CoffeeDecorator{

    public Shugar(Coffee coffee) {
        super(coffee.price + 0.5, coffee);
    }
}
