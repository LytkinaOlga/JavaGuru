package by.bntu.fitr.poisit.lytkina.factory.pizza.bean.pizza;

import by.bntu.fitr.poisit.lytkina.factory.pizza.service.component.ComponentFactoryI;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Pizza {
    protected String name;
    protected ComponentFactoryI componentFactory;

    public abstract void prepare();
    public void bake(){
        System.out.println("Baking " + name + "pizza");
    }
    public void cut(){
        System.out.println("Cutting " + name + "pizza");
    }
    public void box(){
        System.out.println("Boxing " + name + "pizza");
    }

}
