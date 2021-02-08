import org.testng.annotations.Test;
import ru.ssau.tk.andreyauf.ooppractika.Matrix;

import static org.testng.Assert.*;

public class MatrixTest {

    @Test
    public void testTestToString() {
        Matrix firstMatrix = new Matrix(3, 3);
        firstMatrix.setAt(0, 0, 6);
        firstMatrix.setAt(0, 1, 6);
        firstMatrix.setAt(0, 2, 6);
        firstMatrix.setAt(1, 0, 6);
        firstMatrix.setAt(1, 1, 6);
        firstMatrix.setAt(1, 2, 6);
        firstMatrix.setAt(2, 0, 6);
        firstMatrix.setAt(2, 1, 6);
        firstMatrix.setAt(2, 2, 6);
        assertEquals(firstMatrix.toString(), new String("6.0,6.0,6.0;\n" + "6.0,6.0,6.0;\n" + "6.0,6.0,6.0;"));
    }
}