package evaluator.nodes.operations;

import evaluator.Node;
import evaluator.Type;
import evaluator.nodes.Operation;

public class BinaryOperation extends Operation {
    
    private final Operator operator;
    protected final Node left;
    protected final Node right;

    public BinaryOperation(Operator operator, Node left, Node right) {
        this.operator = operator;
        this.left = left;
        this.right = right;
    }

    public Operator getOperator() {
        return operator;
    }

    public String getOperatorSymbol() {
        return operator.getSymbol();
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    @Override
    public Type evaluate() {
        return null;
    }

    
}
