package BinaryOperatorPackageTest;

import static org.junit.Assert.*;
import org.junit.Test;
import arbolsintactico.Data.*;
import arbolsintactico.Operators.Binary.*;

public class DivOperatorTest {

    public DivOperatorTest() {
    }

    @Test
    public void DivWithTwoConstants(){
        assertEquals(new DivOperator(new Constant(1.0), new Constant(1.0)).evaluate(), 1.0, 0);
    }
    
    @Test
    public void DivWithTwoUnknows(){
        Unknow firstUnknow = new Unknow(1.0, "firstUnknow");
        Unknow secondUnknow = new Unknow(1.0, "secondUnknow");
        
        assertEquals(new DivOperator(firstUnknow, secondUnknow).evaluate(), 1.0, 0);
    }
    
    @Test
    public void DivWithAConstantAndAUnknow(){
        Unknow unknow = new Unknow(1.0, "unknow");
        Constant constant = new Constant(1.0);
        
        assertEquals(new DivOperator(unknow, constant).evaluate(), 1.0, 0);
    }
}