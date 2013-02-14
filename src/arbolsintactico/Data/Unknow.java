package arbolsintactico.Data;

import arbolsintactico.Node;


public class Unknow implements Node{
    private double value;
    private String name;

    public Unknow(double value, String name) {
        this.value = value;
        this.name = name;
    }
    
    @Override
    public double evaluate() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
