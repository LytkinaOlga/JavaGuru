package by.bntu.fitr.poisit.lytkina.decorator.employees;

public class Employee implements EmployeeI {
    private String name;

    public Employee() {
    }

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void openTask() {
        System.out.println(name + " open task");
    }

    @Override
    public void reopenTask() {
        System.out.println(name + " reopen task");
    }

    @Override
    public void resolveTask() {
        System.out.println(name + " resolve task");
    }
}
