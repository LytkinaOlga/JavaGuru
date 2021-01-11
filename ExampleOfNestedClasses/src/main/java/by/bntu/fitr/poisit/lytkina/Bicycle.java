package by.bntu.fitr.poisit.lytkina;

public class Bicycle {
    private String model;
    private static int number;

    public void start() {
        System.out.println("Поехали!");
    }

    public class SteeringWheel{
        int c;
        public void right() {
            System.out.println("Руль вправо!" + model + number);
        }
    }
    static class Seat {
        int a;
        public void up() {

            System.out.println("сиденье поднято выше!" + number);
        }
    }
}
