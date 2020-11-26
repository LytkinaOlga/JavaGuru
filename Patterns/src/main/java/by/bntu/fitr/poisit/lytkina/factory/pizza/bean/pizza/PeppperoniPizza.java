package by.bntu.fitr.poisit.lytkina.factory.pizza.bean.pizza;

import by.bntu.fitr.poisit.lytkina.factory.pizza.service.component.ComponentFactoryI;

public class PeppperoniPizza extends Pizza{
    public PeppperoniPizza(String name, ComponentFactoryI componentFactory){
        this.name = name;
        this.componentFactory = componentFactory;
    }

    @Override
    public void prepare() {
        componentFactory.createCheese();

    }
}
