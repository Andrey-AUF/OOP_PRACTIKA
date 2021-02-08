import org.testng.annotations.Test;
import ru.ssau.tk.andreyauf.ooppractika.Point;

import static org.testng.Assert.*;

public class PointTest {


    @Test
    public void testTestToString() {
        assertEquals(new Point(1, 2, 3).toString(), "[1.0, 2.0, 3.0]");
        assertEquals(new Point(1.1, 2.2, 3.3).toString(), "[1.1, 2.2, 3.3]");
        assertEquals(new Point(-1.1, -2.2, -3.3).toString(), "[-1.1, -2.2, -3.3]");
    }

}