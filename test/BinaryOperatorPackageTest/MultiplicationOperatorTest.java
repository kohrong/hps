package BinaryOperatorPackageTest;

import evaluator.nodes.Constant;
import evaluator.nodes.Variable;
import evaluator.operations.MultiplicationOperator;
import static org.junit.Assert.*;
import org.junit.Test;

public class MultiplicationOperatorTest {

    public MultiplicationOperatorTest() {
    }

    @Test
    public void MultiplicationOperatorWithTwoConstants(){
        assertEquals(new MultiplicationOperator(new Constant(1.0), new Constant(1.0)).evaluate(), 1.0, 0);
    }
    
    @Test
    public void MultiplicationOperatorWithTwoUnknows(){
        Variable firstUnknow = new Variable(1.0, "firstUnknow");
        Variable secondUnknow = new Variable(1.0, "secondUnknow");
        assertEquals(new MultiplicationOperator(firstUnknow, secondUnknow).evaluate(), 1.0, 0);
    }
    
    @Test
    public void MultiplicationWithAConstantAndAUnknow(){
        Variable unknow = new Variable(1.0, "firstUnknow");
        Constant constant = new Constant(1.0);
        assertEquals(new MultiplicationOperator(unknow, constant).evaluate(), 1.0, 0);
    }
}