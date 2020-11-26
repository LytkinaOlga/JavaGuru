package by.bntu.fitr.poisit.lytkina.factory.pizza;

import by.bntu.fitr.poisit.lytkina.factory.pizza.service.component.ArabiaComponentFactory;
import by.bntu.fitr.poisit.lytkina.factory.pizza.service.pizza.PizzaFactory;
import by.bntu.fitr.poisit.lytkina.factory.pizza.service.PizzaService;

public class PizzaFactoryApplication {
    public static void main(String[] args) throws Exception {
        PizzaService pizzaService = new PizzaService(new PizzaFactory(), new ArabiaComponentFactory());
        pizzaService.orderPizza("hawaii");
    }

}
