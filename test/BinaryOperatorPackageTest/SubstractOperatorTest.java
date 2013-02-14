package BinaryOperatorPackageTest;

import arbolsintactico.Data.*;
import arbolsintactico.Operators.Binary.SubstractOperator;
import static org.junit.Assert.*;
import org.junit.Test;

public class SubstractOperatorTest {

    public SubstractOperatorTest() {
    }

    @Test
    public void SubstractWithTwoConstants(){
        assertEquals(new SubstractOperator(new Constant(1.0), new Constant(1.0)).getValue(), 0.0, 0);
    }
    
    @Test
    public void SubstractWithTwoUnknows(){
        Unknow firstUnknow = new Unknow(1.0, "firstUnknow");
        Unknow secondUnknow = new Unknow(1.0, "secondUnknow");
        
        assertEquals(new SubstractOperator(firstUnknow, secondUnknow).getValue(), 0.0, 0);
    }
    
    @Test
    public void SubstractWithAConstantAndAUnknow(){
        Unknow unknow = new Unknow(1.0, "unknow");
        Constant constant = new Constant(1.0);
        
        assertEquals(new SubstractOperator(unknow, constant).getValue(), 0.0, 0);
    }
}