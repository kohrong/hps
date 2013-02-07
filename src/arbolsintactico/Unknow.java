package arbolsintactico;


public class Unknow implements Node{
    private double value;
    private String name;

    public Unknow(double value, String name) {
        this.value = value;
        this.name = name;
    }
    
    @Override
    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
