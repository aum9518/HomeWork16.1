public class Rectangle extends Shapes{
    private int length;
    private int width;

    @Override
    public void findArea() {
        int area = length*width;
        System.out.println("Rectangle area is: "+area);
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle() {
    }
}
