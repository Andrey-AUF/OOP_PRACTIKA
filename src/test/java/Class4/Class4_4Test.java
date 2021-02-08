package Class4;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Class4_4Test {

    @Test
    public void getIntOfString() {
        System.out.println(Class4_4.getIntOfString("10", "5"));
        Assert.assertThrows(ArithmeticException.class,
                () -> Class4_4.getIntOfString("10", "0"));
        Assert.assertThrows(NumberFormatException.class,
                () -> Class4_4.getIntOfString("r", "1"));
        Assert.assertThrows(NumberFormatException.class,
                () -> Class4_4.getIntOfString("r", "a"));
    }
}