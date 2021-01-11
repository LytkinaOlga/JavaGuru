package by.bntu.fitr.poisit.lytkina.streams;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.stream.Collectors;

public class FunctionalCycles {
    public static Logger logger = LoggerFactory.getLogger(FunctionalCycles.class);

    public static void main(String[] args) {
        List<String> names = List.of("Olya", "nastya", "sasha", "sasha");

        names.forEach(System.out::println);
        names.forEach(FunctionalCycles::info);
        names.stream().forEach(FunctionalCycles::info);
    }

    public static void info(String message){
        logger.info(message);
    }
}
