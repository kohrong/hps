package arbolsintactico.Operators.Binary;

import arbolsintactico.Node;
import arbolsintactico.Operators.Binary.BinaryOperator;

public class SumOperator extends BinaryOperator {

    public SumOperator(Node left, Node right) {
        super(left, right);
    }

    @Override
    public double getValue() {
        return left.getValue() + right.getValue();
    }
    
    
    
}
