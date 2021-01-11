package by.bntu.fitr.poisit.lytkina.decorator.employees;

import by.bntu.fitr.poisit.lytkina.decorator.employees.Employee;

public class TeamLead  extends Employee {
    public TeamLead() {
        super();
    }

    public TeamLead(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void openTask() {
        super.openTask();
    }

    @Override
    public void reopenTask() {
        super.reopenTask();
        doit();
    }

    @Override
    public void resolveTask() {
        super.resolveTask();
    }
    public void doit(){
        System.out.println("kjhbvc");
    }
}
