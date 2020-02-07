
import Shape.Point;
import Shape.*;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TriangleTest {
private static final double DELTA = 1e-15;


    @Test
    public void testTriangleSurface() {
        Triangle triangle = new Triangle(new Point(10, 3), new Point(10, 6), new Point(13, 3));
        assertEquals(4.499999999999997, triangle.getSurface(),DELTA);
    }

    @Test
    public void testTrianglePerimeter() {
        Triangle triangle = new Triangle(new Point(10, 3), new Point(10, 6), new Point(13, 3));
        assertEquals(10.242640687119284, triangle.getPerimeter(),DELTA);
    }       
}
