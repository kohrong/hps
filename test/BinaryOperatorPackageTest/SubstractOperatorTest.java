package BinaryOperatorPackageTest;

import evaluator.nodes.Constant;
import evaluator.nodes.Variable;
import evaluator.operations.SubstractOperator;
import static org.junit.Assert.*;
import org.junit.Test;

public class SubstractOperatorTest {

    public SubstractOperatorTest() {
    }

    @Test
    public void SubstractWithTwoConstants(){
        assertEquals(new SubstractOperator(new Constant(1.0), new Constant(1.0)).evaluate(), 0.0, 0);
    }
    
    @Test
    public void SubstractWithTwoUnknows(){
        Variable firstUnknow = new Variable(1.0, "firstUnknow");
        Variable secondUnknow = new Variable(1.0, "secondUnknow");
        
        assertEquals(new SubstractOperator(firstUnknow, secondUnknow).evaluate(), 0.0, 0);
    }
    
    @Test
    public void SubstractWithAConstantAndAUnknow(){
        Variable unknow = new Variable(1.0, "unknow");
        Constant constant = new Constant(1.0);
        
        assertEquals(new SubstractOperator(unknow, constant).evaluate(), 0.0, 0);
    }
}