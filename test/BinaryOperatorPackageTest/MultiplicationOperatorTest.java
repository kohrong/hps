package BinaryOperatorPackageTest;

import arbolsintactico.Data.*;
import arbolsintactico.Operators.Binary.MultiplicationOperator;
import static org.junit.Assert.*;
import org.junit.Test;

public class MultiplicationOperatorTest {

    public MultiplicationOperatorTest() {
    }

    @Test
    public void MultiplicationOperatorWithTwoConstants(){
        assertEquals(new MultiplicationOperator(new Constant(1.0), new Constant(1.0)).getValue(), 1.0, 0);
    }
    
    @Test
    public void MultiplicationOperatorWithTwoUnknows(){
        Unknow firstUnknow = new Unknow(1.0, "firstUnknow");
        Unknow secondUnknow = new Unknow(1.0, "secondUnknow");
        assertEquals(new MultiplicationOperator(firstUnknow, secondUnknow).getValue(), 1.0, 0);
    }
    
    @Test
    public void MultiplicationWithAConstantAndAUnknow(){
        Unknow unknow = new Unknow(1.0, "firstUnknow");
        Constant constant = new Constant(1.0);
        assertEquals(new MultiplicationOperator(unknow, constant).getValue(), 1.0, 0);
    }
}