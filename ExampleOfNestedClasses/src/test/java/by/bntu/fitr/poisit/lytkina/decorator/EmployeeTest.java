package by.bntu.fitr.poisit.lytkina.decorator;

import by.bntu.fitr.poisit.lytkina.decorator.employees.Developer;
import by.bntu.fitr.poisit.lytkina.decorator.employees.Employee;
import org.junit.Before;
import org.junit.Test;

public class EmployeeTest {

    Developer olya;
    @Before
    public void init(){
        olya = new Developer(new Employee("Olya"));
    }

    @Test
    public void openTask() {
        olya.openTask();

    }

    @Test
    public void reopenTask() {
        olya.reopenTask();
    }

    @Test
    public void resolveTask() {
        olya.resolveTask();
    }
}