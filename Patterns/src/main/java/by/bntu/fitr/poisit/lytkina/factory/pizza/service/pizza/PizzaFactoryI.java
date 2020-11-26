package by.bntu.fitr.poisit.lytkina.factory.pizza.service.pizza;

import by.bntu.fitr.poisit.lytkina.factory.pizza.bean.pizza.Pizza;
import by.bntu.fitr.poisit.lytkina.factory.pizza.service.component.ComponentFactoryI;

public interface PizzaFactoryI {
    Pizza getPizza(String name, ComponentFactoryI componentFactory) throws Exception;
}
