package evaluator.nodes.operations;

import java.lang.reflect.Field;
import java.util.HashMap;

public class Operator {

    private String symbol;
    
    private Operator(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

    public static Operator get(String symbol) {
        return operatorMap.get(symbol);
        
    }
    
    private static HashMap<String, Operator> operatorMap;
    private static final Operator SUM = new Operator("+");
    private static final Operator SUBSTRACT = new Operator("-");
    private static final Operator MULTIPLY = new Operator("*");
    private static final Operator DIVIDE = new Operator("/");
    
    static {
        operatorMap = new HashMap<>();
        for (Field field : Operator.class.getDeclaredFields()) {
            if (field.getType() != Operator.class) continue;
            operatorMap.put(getOperator(field).getSymbol(), getOperator(field));
        }
    }
    
    private static Operator getOperator(Field field) {
        try {
            return (Operator) field.get(null);
        } catch (IllegalArgumentException ex) {
            return null;
        } catch (IllegalAccessException ex) {
            return null;
        }
    }
}
