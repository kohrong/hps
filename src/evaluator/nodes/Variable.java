package evaluator.nodes;

import evaluator.Node;
import evaluator.Type;


public class Variable implements Node {
    private Type value;
    private String name;

    public Variable(Type value, String name) {
        this.value = value;
        this.name = name;
    }

    public void setValue(Type value) {
        this.value = value;
    }

    @Override
    public Type evaluate() {
        return value;
    }
}
