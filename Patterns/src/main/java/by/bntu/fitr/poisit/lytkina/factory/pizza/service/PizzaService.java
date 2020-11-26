package by.bntu.fitr.poisit.lytkina.factory.pizza.service;

import by.bntu.fitr.poisit.lytkina.factory.pizza.bean.pizza.Pizza;
import by.bntu.fitr.poisit.lytkina.factory.pizza.service.component.ComponentFactoryI;
import by.bntu.fitr.poisit.lytkina.factory.pizza.service.pizza.PizzaFactory;

public class PizzaService{
    PizzaFactory pizzaFactory;
    ComponentFactoryI componentFactory;

    public PizzaService(PizzaFactory pizzaFactory, ComponentFactoryI componentFactory) {
        this.pizzaFactory = pizzaFactory;
        this.componentFactory = componentFactory;
    }

    public Pizza orderPizza(String name) throws Exception {
        PizzaFactory pizzaFactory = new PizzaFactory();
        Pizza pizza = pizzaFactory.getPizza(name, componentFactory);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;

    }
}
