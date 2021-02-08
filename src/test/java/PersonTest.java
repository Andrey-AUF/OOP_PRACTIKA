
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PersonTest {

    @Test
    public void testTestToString() {
        Person h = new Person("Andrey", "Penskiy", 862495137);
        assertEquals(h.toString(), "Andrey Penskiy");


    }

}