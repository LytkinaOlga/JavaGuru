package by.bntu.fitr.poisit.lytkina.factory.pizza.service.pizza;

import by.bntu.fitr.poisit.lytkina.factory.pizza.bean.pizza.IndiaForCheesePizza;
import by.bntu.fitr.poisit.lytkina.factory.pizza.bean.pizza.IndiaHawaiiPizza;
import by.bntu.fitr.poisit.lytkina.factory.pizza.bean.pizza.IndiaPeppperoniPizza;
import by.bntu.fitr.poisit.lytkina.factory.pizza.bean.pizza.Pizza;
import by.bntu.fitr.poisit.lytkina.factory.pizza.service.component.ComponentFactoryI;

public class IndiaPizzaFactory implements PizzaFactoryI{
    public Pizza getPizza(String name, ComponentFactoryI componentFactory) throws Exception {
        Pizza pizza = null;

        if (name.equals(pizza)) {
            pizza = new IndiaForCheesePizza("India For cheese pizza", componentFactory);
        } else if (name.equals(pizza)) {
            pizza = new IndiaHawaiiPizza("India Hawaii pizza", componentFactory);
        } else if (name.equals(pizza)) {
            pizza = new IndiaPeppperoniPizza("India Pepperoni pizza", componentFactory);
        } else {
            throw new Exception("Invalid input");
        }
        return pizza;
    }
}
