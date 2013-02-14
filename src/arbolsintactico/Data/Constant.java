package arbolsintactico.Data;

import arbolsintactico.Node;

public class Constant implements Node {
    private double value;

    public Constant(double value) {
        this.value = value;
    }
    
    @Override
    public double evaluate() {
        return value;
    }
}
