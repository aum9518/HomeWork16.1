public class Circle extends Shapes{
    private final double PI = Math.PI;
    private int radius;

    @Override
    public void findArea() {
        double area = PI *(radius*radius);
    }

    public double getPI() {
        return PI;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public Circle() {
    }
}
