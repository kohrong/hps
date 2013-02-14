package DataPackageTest;

import arbolsintactico.Data.Unknow;
import static org.junit.Assert.*;
import org.junit.Test;

public class UnknowTest {

    public UnknowTest() {
    }

    @Test
    public void CreateAUnknow(){
        assertEquals(new Unknow(1.0, "unknow").evaluate(), 1.0, 0);
    }
}