package Class4;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Class4_5_1Test {

    @Test
    public void testTestClone() {
        Class4_5_1 temp = new Class4_5_1();
        Assert.assertThrows(CloneNotSupportedException.class, temp::clone);
    }
}