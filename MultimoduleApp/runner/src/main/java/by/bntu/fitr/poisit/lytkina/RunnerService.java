package by.bntu.fitr.poisit.lytkina;

import by.bntu.fitr.poisit.lytkina.service.MessageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RunnerService {
    private static Logger log = LoggerFactory.getLogger(RunnerService.class);
    public static void main(String[] args) {
        log.error("Error");
        log.warn("Warn");
        log.info(MessageService.getRandom());
        log.debug("Debug");
        log.trace("Trace");
    }
}
