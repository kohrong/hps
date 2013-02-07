package arbolsintactico.Operators.Binary;

import arbolsintactico.Node;
import arbolsintactico.Operators.Operator;

public abstract class BinaryOperator extends Operator {
    
    protected Node left;
    protected Node right;

    public BinaryOperator(Node left, Node right) {
        this.left = left;
        this.right = right;
    }
    
    
}
