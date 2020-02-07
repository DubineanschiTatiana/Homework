
import Shape.*;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RectangleTest {
 private static final double DELTA = 1e-15;


    @Test
    public void testRectSurface() {
        Rectangle rect = new Rectangle(new Point(5, 2), 5,2);
        assertEquals(10, rect.getSurface(),DELTA);
    }

    @Test
    public void testRectPerimeter() {
        Rectangle rect = new Rectangle(new Point(5, 2), 5,2);
        assertEquals(14, rect.getPerimeter(),DELTA);
    }   
}
