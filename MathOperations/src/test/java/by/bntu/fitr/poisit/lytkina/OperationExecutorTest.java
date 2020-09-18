package by.bntu.fitr.poisit.lytkina;

import org.junit.Test;

import static org.junit.Assert.*;

public class OperationExecutorTest {

    @Test
    public void execute() {
        MathOperations[] mathOperations = {
                new AdditionOperation(),
                new DivisionOperation(),
                new SubtractionOperation(),
                new MultiplicationOperation()
        };

        OperationExecutor operationExecutor = new OperationExecutor();
        operationExecutor.execute(mathOperations, 4, 5);
    }
}