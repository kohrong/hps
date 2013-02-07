package arbolsintactico.Operators.Binary;

import arbolsintactico.Node;
import arbolsintactico.Operators.Binary.BinaryOperator;


public class MultiplicationOperator extends BinaryOperator {
    
    public MultiplicationOperator(Node left, Node right) {
        super(left, right);
    }

    @Override
    public double getValue() {
        return left.getValue() * right.getValue();
    }

}