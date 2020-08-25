package by.bntu.fitr.poisit.lytkina;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DoWhileOddChecker {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger("my log");
        int i = 0;
        do {
            if (i % 2 == 1) {
                logger.info("{} - odd number", i);
            }
            i++;
        }
        while (i < 51);
    }
}
