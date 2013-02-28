package DataPackageTest;

import evaluator.Type;
import static org.junit.Assert.*;
import evaluator.nodes.Constant;
import org.junit.Test;

public class ConstantTest {

    public ConstantTest() {
    }

    @Test
    public void createConstant(){
        Type<Double> value = new Type<Double>(1.0);
        assertEquals((double) new Constant(value).evaluate(), 1.0, 0);
    }
}