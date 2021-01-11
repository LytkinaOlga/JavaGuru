package by.bntu.fitr.poisit.lytkina;

public class MyRannable implements Runnable{
    private String name;
    public MyRannable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        App.logger.info("Hello. I am thread from runnable {}", name);
    }
}
