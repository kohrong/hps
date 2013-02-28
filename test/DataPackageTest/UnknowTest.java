package DataPackageTest;

import evaluator.Type;
import evaluator.nodes.Variable;
import static org.junit.Assert.*;
import org.junit.Test;

public class UnknowTest {

    public UnknowTest() {
    }

    @Test
    public void CreateAUnknow(){
        Type<Double> value = new Type<Double>(1.0);
        assertEquals((Double) new Variable(value, "unknow").evaluate(), 1.0, 0);
    }
}