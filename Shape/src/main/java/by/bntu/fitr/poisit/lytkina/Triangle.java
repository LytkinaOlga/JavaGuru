package by.bntu.fitr.poisit.lytkina;

public class Triangle extends AbstractShape{
    public static final String TRIANGLENAME = "Triangle";
    private int heightLength;
    private int baseLength;

    public Triangle(int heightLength, int baseLength) {
        this.heightLength = heightLength;
        this.baseLength = baseLength;
    }

    public int getHeightLength() {
        return heightLength;
    }

    public int getBaseLength() {
        return baseLength;
    }

    @Override
    public String getName() {
        return TRIANGLENAME;
    }

    @Override
    public double getArea() {
        return 0.5 * heightLength * baseLength;
    }
}
