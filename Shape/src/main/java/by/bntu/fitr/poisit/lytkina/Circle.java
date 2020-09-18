package by.bntu.fitr.poisit.lytkina;

public class Circle extends AbstractShape{
    public static final String CIRCLENAME = "Circle";
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public String getName() {
        return CIRCLENAME;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
