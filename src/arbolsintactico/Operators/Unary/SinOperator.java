package arbolsintactico.Operators.Unary;

import arbolsintactico.Node;

public class SinOperator extends UnaryOperator{
    
    public SinOperator(Node child){
        super(child);
    }
    
    @Override
    public double getValue() {
        return Math.sin(child.getValue());
    }

}
