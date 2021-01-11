package by.bntu.fitr.poisit.lytkina.decorator.employees;

public class Developer extends EmployeeDecorator {

    public Developer(Employee employee) {
        super(employee);
    }

    @Override
    public void openTask() {
        super.openTask();
        startProgress();
    }

    @Override
    public void reopenTask() {
        super.reopenTask();
        startProgress();
    }

    @Override
    public void resolveTask() {
        super.resolveTask();
        stopProgress();
    }

    public void startProgress() {
        System.out.println(employee.getName() + " starting task");
    }
    public void stopProgress() {
        System.out.println(employee.getName() + " stopping task");
    }
}
