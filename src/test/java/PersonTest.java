
import org.testng.annotations.Test;
import ru.ssau.tk.andreyauf.ooppractika.Person;

import static org.testng.Assert.*;

public class PersonTest {

    @Test
    public void testTestToString() {
        Person h = new Person("Andrey", "Penskiy", 862495137);
        assertEquals(h.toString(), "Andrey Penskiy");


    }

}