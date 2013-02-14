package arbolsintactico.Operators.Unary;

import arbolsintactico.Node;
import arbolsintactico.Operators.Operator;


public class UnaryOperator extends Operator{
    protected Node child;

    public UnaryOperator(Node child) {
        this.child = child;
    }

    @Override
    public double evaluate() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    
}
