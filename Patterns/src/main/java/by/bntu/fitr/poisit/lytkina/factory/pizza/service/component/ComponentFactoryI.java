package by.bntu.fitr.poisit.lytkina.factory.pizza.service.component;

import by.bntu.fitr.poisit.lytkina.factory.pizza.bean.component.Becon;
import by.bntu.fitr.poisit.lytkina.factory.pizza.bean.component.Cheese;
import by.bntu.fitr.poisit.lytkina.factory.pizza.bean.component.Sause;

public interface ComponentFactoryI {
    Becon createBecon();
    Cheese createCheese();
    Sause createSause();
}
