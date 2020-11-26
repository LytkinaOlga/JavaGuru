package by.bntu.fitr.poisit.lytkina.factory.pizza.service.pizza;

import by.bntu.fitr.poisit.lytkina.factory.pizza.bean.pizza.ForCheesePizza;
import by.bntu.fitr.poisit.lytkina.factory.pizza.bean.pizza.HawaiiPizza;
import by.bntu.fitr.poisit.lytkina.factory.pizza.bean.pizza.PeppperoniPizza;
import by.bntu.fitr.poisit.lytkina.factory.pizza.bean.pizza.Pizza;
import by.bntu.fitr.poisit.lytkina.factory.pizza.service.component.ComponentFactoryI;

public class PizzaFactory implements PizzaFactoryI{


    public Pizza getPizza(String name, ComponentFactoryI componentFactory) throws Exception {

        Pizza pizza = null;

        if (name.equals(pizza)) {
            pizza = new ForCheesePizza("For cheese pizza", componentFactory);
        } else if (name.equals(pizza)) {
            pizza = new HawaiiPizza("Hawaii pizza", componentFactory);
        } else if (name.equals(pizza)) {
            pizza = new PeppperoniPizza("Pepperoni pizza", componentFactory);
        } else {
            throw new Exception("Invalid input");
        }
        return pizza;
    }
}
