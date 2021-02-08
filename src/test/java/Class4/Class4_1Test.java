package Class4;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.ssau.tk.andreyauf.ooppractika.Person;

import static org.testng.Assert.*;

public class Class4_1Test {


    @Test
    public void getObjectPerson() {
        Person p1 = new Person("Andrey", "Penskiy");
        assertEquals(Class4_1.getObjectPerson(p1), "Andrey Penskiy");
        Person p2 = new Person(null, null);
        Assert.assertThrows(NullPointerException.class, () -> {
            assertNull(p2);
        });
    }
}

