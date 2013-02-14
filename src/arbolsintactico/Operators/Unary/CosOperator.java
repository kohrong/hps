package arbolsintactico.Operators.Unary;

import arbolsintactico.Node;


public class CosOperator extends UnaryOperator{

    public CosOperator(Node child) {
        super(child);
    }
    
    @Override
    public double evaluate(){
        return Math.cos(child.evaluate());
    }
}
