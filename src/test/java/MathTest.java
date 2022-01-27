import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MathTest {

    @Test
    public void add() {
        Assert.assertEquals(10,Math.add(5,5));
    }
}