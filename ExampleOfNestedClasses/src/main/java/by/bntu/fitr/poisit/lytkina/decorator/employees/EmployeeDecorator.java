package by.bntu.fitr.poisit.lytkina.decorator.employees;

public abstract class EmployeeDecorator implements EmployeeI {
    protected Employee employee;

    public EmployeeDecorator() {
    }

    public EmployeeDecorator(Employee employee) {
        this.employee = employee;
    }

    @Override
    public void openTask() {
        employee.openTask();
    }

    @Override
    public void reopenTask() {
        employee.reopenTask();
    }

    @Override
    public void resolveTask() {
        employee.resolveTask();
    }
}
