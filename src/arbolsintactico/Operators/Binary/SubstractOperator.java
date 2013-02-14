package arbolsintactico.Operators.Binary;

import arbolsintactico.Node;
import arbolsintactico.Operators.Binary.BinaryOperator;

public class SubstractOperator extends BinaryOperator {

    public SubstractOperator(Node left, Node right) {
        super(left, right);
    }
    
    @Override
    public double evaluate() {
        return left.evaluate() - right.evaluate();
    }

}
