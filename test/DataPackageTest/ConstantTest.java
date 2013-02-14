package DataPackageTest;

import static org.junit.Assert.*;
import arbolsintactico.Data.Constant;
import org.junit.Test;

public class ConstantTest {

    public ConstantTest() {
    }

    @Test
    public void CreateAConstant(){
        assertEquals(new Constant(1.0).getValue(), 1.0, 0);
    }
}