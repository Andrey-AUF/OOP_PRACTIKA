package Class4;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Class4_5Test {


    @Test
    public void testTestClone() throws CloneNotSupportedException {
        Class4_5_1 temp = new Class4_5_1();
        Class4_5_1 copy = (Class4_5_1) temp.clone();
        Class4_5 temp1 = new Class4_5();
        Class4_5 copy1 = (Class4_5) temp1.clone();
    }
}