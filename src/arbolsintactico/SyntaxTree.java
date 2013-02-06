package arbolsintactico;

import arbolsintactico.Operators.SumOperator;
import arbolsintactico.Operators.MultiplicationOperator;

public class SyntaxTree {

    
    public static void main(String[] args) {
        Node constant1 = new Constant(1);
        Node constant2 = new Constant(2);
        Node constant3 = new Constant(3);
        Node multiplicationOperator = new MultiplicationOperator(constant2, constant3);
        Node sumOperator = new SumOperator(constant1, multiplicationOperator);
        
        System.out.println(sumOperator.getValue());
    }
}
