package arbolsintactico;

import arbolsintactico.Data.Unknow;
import arbolsintactico.Data.Constant;
import arbolsintactico.Operators.Binary.MultiplicationOperator;
import arbolsintactico.Operators.Binary.SumOperator;
import static java.lang.System.out;

public class SyntaxTree {

    
    public static void main(String[] args) {
        Node constant1 = new Constant(1);
        Node constant2 = new Constant(2);
        Unknow xVariable = new Unknow(3, "X");
        Node multiplicationOperator = new MultiplicationOperator(constant2, xVariable);
        Node sumOperator = new SumOperator(constant1, multiplicationOperator);
        
        out.println(sumOperator.getValue());
    }
}
