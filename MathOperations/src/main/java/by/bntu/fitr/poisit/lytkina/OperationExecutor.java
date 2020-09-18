package by.bntu.fitr.poisit.lytkina;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OperationExecutor {
    Logger logger = LoggerFactory.getLogger(OperationExecutor.class);
    void execute(MathOperations[] operations, double a, double b){
        for (MathOperations operation:operations) {
            logger.info( "{} : {}", operation.getClass(), operation.compute(a, b));
        }
    }
}
