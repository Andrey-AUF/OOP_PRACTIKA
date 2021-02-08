package Class4;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Class4_3Test {

    @Test
    public void testGetSymbolOnIndex() {
        String[] str = {"I", "believe", "i", "can", "fly"};
        assertEquals(Class4_3.getSymbolOnIndex(str, 0), new String[]{"I", "b", "i", "c", "f"});
        Assert.assertThrows(StringIndexOutOfBoundsException.class,
                () -> assertEquals(Class4_3.getSymbolOnIndex(str, 1),
                        new String[]{"", "e", "", "a", "l"}));
        Assert.assertThrows(NullPointerException.class,
                () -> assertNull(Class4_3.getSymbolOnIndex(null, 0)));
        String[] str1 = {null, "null"};
        Assert.assertThrows(NullPointerException.class,
                () -> assertNull(Class4_3.getSymbolOnIndex(str1, 0)));
    }
}
