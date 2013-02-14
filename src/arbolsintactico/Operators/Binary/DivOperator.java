package arbolsintactico.Operators.Binary;

import arbolsintactico.Node;


public class DivOperator extends BinaryOperator{

    public DivOperator(Node left, Node right) {
        super(left, right);
    }

    @Override
    public double getValue() {
        return (left.getValue()/right.getValue());
    }

}