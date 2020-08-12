package by.bntu.fitr.poisit.lytkina;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ForOddChecker {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger("my log");
        for (int i = 0; i < 51; i++) {
            if (i % 2 == 1) {
                logger.info("{} - odd number", i);
            }
        }
    }
}
