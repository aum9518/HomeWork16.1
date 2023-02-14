public class Tringle extends Shapes{
    private int high;
    private int base;

    public Tringle(int high, int base) {
        this.high = high;
        this.base = base;
    }

    public Tringle() {
    }

    @Override
    public void findArea() {
        int area = base*high/2;
        System.out.println("Area of tringle is: "+area);
    }

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }
}
