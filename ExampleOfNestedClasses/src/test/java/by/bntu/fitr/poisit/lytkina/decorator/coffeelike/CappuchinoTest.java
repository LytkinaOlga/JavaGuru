package by.bntu.fitr.poisit.lytkina.decorator.coffeelike;

import org.junit.Test;

import static org.junit.Assert.*;

public class CappuchinoTest {
    @Test
    public void CoffeeTest(){
        Coffee cappuchinoWithShugar = new Shugar(new Cappuchino("cuppuchino", 2.5));
        System.out.println("The cost of " + cappuchinoWithShugar.name + " is " + cappuchinoWithShugar.price);

        Coffee cappuchinoWithSugarAndChocolate = new Chocolate(cappuchinoWithShugar);
        System.out.println("the cost of " + cappuchinoWithSugarAndChocolate.name + " is " + cappuchinoWithSugarAndChocolate.price);

        Coffee coffee = new Cappuchino("cuppuch", 3);
        Coffee coffeeWithChock = new Chocolate(coffee);
        System.out.println("the cost of " + coffeeWithChock.name + " is " + coffeeWithChock.price);
    }

}