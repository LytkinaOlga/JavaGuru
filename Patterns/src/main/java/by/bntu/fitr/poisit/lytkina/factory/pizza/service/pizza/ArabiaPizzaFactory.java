package by.bntu.fitr.poisit.lytkina.factory.pizza.service.pizza;

import by.bntu.fitr.poisit.lytkina.factory.pizza.bean.pizza.ArabiaForCheesePizza;
import by.bntu.fitr.poisit.lytkina.factory.pizza.bean.pizza.ArabiaHawaiiPizza;
import by.bntu.fitr.poisit.lytkina.factory.pizza.bean.pizza.PeppperoniPizza;
import by.bntu.fitr.poisit.lytkina.factory.pizza.bean.pizza.Pizza;
import by.bntu.fitr.poisit.lytkina.factory.pizza.service.component.ComponentFactoryI;

public class ArabiaPizzaFactory implements PizzaFactoryI{
    public Pizza getPizza(String name, ComponentFactoryI componentFactory) throws Exception {
        Pizza pizza = null;

        if (name.equals(pizza)) {
            pizza = new ArabiaForCheesePizza("Arabia For cheese pizza", componentFactory);
        } else if (name.equals(pizza)) {
            pizza = new ArabiaHawaiiPizza("Arabia Hawaii pizza", componentFactory);
        } else if (name.equals(pizza)) {
            pizza = new PeppperoniPizza("Pepperoni pizza", componentFactory);
        } else {
            throw new Exception("Invalid input");
        }
        return pizza;
    }
}
