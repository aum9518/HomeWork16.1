public class Main {
    public static void main(String[] args) {
        Tringle tringle = new Tringle(7,10);
        Rectangle rectangle = new Rectangle(8,6);
        Circle circle = new Circle(5);
        Square square = new Square(5);
        tringle.findArea();
        rectangle.findArea();
        circle.findArea();
        square.findArea();
    }
}