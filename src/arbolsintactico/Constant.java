package arbolsintactico;

public class Constant implements Node {
    private double value;

    public Constant(double value) {
        this.value = value;
    }
    
    @Override
    public double getValue() {
        return value;
    }

}
