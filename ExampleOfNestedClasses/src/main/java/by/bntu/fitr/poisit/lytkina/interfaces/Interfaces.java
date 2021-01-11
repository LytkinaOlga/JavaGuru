package by.bntu.fitr.poisit.lytkina.interfaces;

import java.util.function.*;

public class Interfaces {
    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("I'm runnable");
        Supplier<String> supplier = () -> "I'm supplier";
        Consumer<String> consumer = name -> System.out.println("Hello! I'm " + name);
        Function<String, String> function = new Function<String, String>() {
            @Override
            public String apply(String s1) {
                return apply(s1);
            }
        };
        BiFunction<String, String, String> biFunction = (s, s2) -> "Hello" + s + s2;
        UnaryOperator<String> unaryOperator = s -> s;
        Predicate<Integer> predicate = integer -> {
            if (integer > 0)
                return true;
            return false;
        };
        String result = supplier.get();
    }

    private static String apply(String s) {
        return s;
    }
}
