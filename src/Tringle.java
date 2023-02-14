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
        int area = 1/2*base*high;
        System.out.println("Tringle area is: "+area);
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
