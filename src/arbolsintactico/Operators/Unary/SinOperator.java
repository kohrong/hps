package arbolsintactico.Operators.Unary;

import arbolsintactico.Node;

public class SinOperator extends UnaryOperator{
    
    public SinOperator(Node child){
        super(child);
    }
    
    @Override
    public double evaluate() {
        return Math.sin(child.evaluate());
    }

}
