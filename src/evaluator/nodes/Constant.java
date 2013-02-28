package evaluator.nodes;

import evaluator.Type;
import evaluator.Node;

public class Constant implements Node {
    private Type value;

    public Constant(Type value) {
        this.value = value;
    }

    public Type getValue() {
        return value;
    }
    
    @Override
    public Type evaluate() {
        return value;
    }
}
