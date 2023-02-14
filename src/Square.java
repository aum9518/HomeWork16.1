public class Square extends Shapes{
private int side;

    @Override
    public void findArea() {
        int area = side*side;
        System.out.println("Area of square is: "+area);
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public Square(int side) {
        this.side = side;
    }

    public Square() {
    }
}
