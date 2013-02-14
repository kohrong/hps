package UnaryOperatorPackageTest;

import static org.junit.Assert.*;
import arbolsintactico.Operators.Unary.CosOperator;
import arbolsintactico.Data.*;
import org.junit.Test;

public class CosOperatorTest {

    public CosOperatorTest() {
    }

    @Test
    public void CosWithConstant(){
        assertEquals(new CosOperator(new Constant(0.0)).evaluate(), 1.0, 0);
    }
    
    @Test
    public void CosWithUnknow(){
        assertEquals(new CosOperator(new Unknow(0.0, "unknow")).evaluate(), 1.0, 0);
    }
}