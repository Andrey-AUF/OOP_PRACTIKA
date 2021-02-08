package Class4;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.ssau.tk.andreyauf.ooppractika.Person;

import java.io.*;

import static org.testng.Assert.*;

public class Class4_6Test {

    @Test
    public void testSet() throws IOException {
        Person obj = new Person();
        String fileName = "";

        Assert.assertThrows(FileNotFoundException.class, () -> Class4_6.set(new ObjectOutputStream(new FileOutputStream(fileName)), obj));
        Assert.assertThrows(ClassCastException.class, () -> Class4_6.set(new ByteArrayOutputStream(), obj));
    }
}