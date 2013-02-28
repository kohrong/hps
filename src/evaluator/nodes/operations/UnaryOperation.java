package evaluator.nodes.operations;

import evaluator.Node;
import evaluator.Type;
import evaluator.nodes.Operation;


public class UnaryOperation extends Operation{
    
    private String name;
    protected Node child;

    public UnaryOperation(String name, Node child) {
        this.name = name;
        this.child = child;
    }

    @Override
    public Type evaluate() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    
}
