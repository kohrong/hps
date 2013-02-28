package UnaryOperatorPackageTest;

import evaluator.nodes.Constant;
import evaluator.nodes.Variable;
import static org.junit.Assert.*;
import arbolsintactico.Operators.Unary.SinOperator;
import org.junit.Test;

public class SinOperatorTest {
    
    public SinOperatorTest() {
    }
    
    @Test
    public void SinOperatorWithConstant(){
        assertEquals(new SinOperator(new Constant((Math.PI)/2)).evaluate(), 1.0, 0);
    }
    
    @Test
    public void SinOperatorWithUnknow(){
        assertEquals(new SinOperator(new Variable((Math.PI)/2, "Incógnita")).evaluate(), 1.0, 0);
    }
}
