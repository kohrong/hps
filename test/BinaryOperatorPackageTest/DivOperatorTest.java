package BinaryOperatorPackageTest;

import evaluator.operations.DivOperator;
import evaluator.nodes.Constant;
import evaluator.nodes.Variable;
import evaluator.Type;
import static org.junit.Assert.*;
import org.junit.Test;

public class DivOperatorTest {

    public DivOperatorTest() {
    }

    @Test
    public void DivWithTwoConstants(){
        Type<Integer> value = new Type(1);
        assertEquals(new DivOperator("div", new Constant(value), new Constant(value)).evaluate(), 1.0, 0);
    }
    
    @Test
    public void DivWithTwoUnknows(){
        Variable firstUnknow = new Variable(1.0, "firstUnknow");
        Variable secondUnknow = new Variable(1.0, "secondUnknow");
        
        assertEquals(new DivOperator(firstUnknow, secondUnknow).evaluate(), 1.0, 0);
    }
    
    @Test
    public void DivWithAConstantAndAUnknow(){
        Variable unknow = new Variable(1.0, "unknow");
        Constant constant = new Constant(1.0);
        
        assertEquals(new DivOperator(unknow, constant).evaluate(), 1.0, 0);
    }
}