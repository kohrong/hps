package BinaryOperatorPackageTest;

import evaluator.nodes.Constant;
import evaluator.Type;
import static org.junit.Assert.*;
import org.junit.Test;
import evaluator.operations.SumOperator;

public class SumOperatorTest {

    public SumOperatorTest() {
    }

    @Test
    public void SumWithTwoConstants(){
        Type<Integer> value = new Type<>(1);
        assertEquals(new SumOperator("add",new Constant(value),new Constant(value)).evaluate(), 2);
    }
    
   /* @Test
    public void SumWithTwoUnknows(){
        Unknow firstUnknow = new Unknow(1.0, "firstUnknow");
        Unknow secondUnknow = new Unknow(1.0, "secondUnknow");
        
        assertEquals(new SumOperator(firstUnknow, secondUnknow).evaluate(), 2.0, 0);
    }
    
    @Test
    public void SumWithAConstantAndAUnknow(){
        Unknow unknow = new Unknow(1.0, "unknow");
        Constant constant = new Constant(1.0);
        
        assertEquals(new SumOperator(unknow, constant).evaluate(), 2.0, 0);
    }*/
}