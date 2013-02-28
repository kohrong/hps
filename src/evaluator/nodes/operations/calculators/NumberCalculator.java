package evaluator.nodes.operations.calculators;


public class NumberCalculator {
    
    @Operator("+")
    public Integer add(Integer arg0, Integer arg1){
        return arg0+arg1;
    }
}
