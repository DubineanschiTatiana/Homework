
import Shape.*;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CircleTest {

    private static final double DELTA = 1e-15;

    @Test
    public void testCircleDiameter() {
        Circle circle = new Circle(new Point(5, 2), 5);
        assertEquals(10, circle.getDiameter(), DELTA);
    }

    @Test
    public void testCircleSurface() {
        Circle circle = new Circle(new Point(5, 2), 5);
        assertEquals(78.53981633974483, circle.getSurface(),DELTA);
    }

    @Test
    public void testCirclePerimeter() {
        Circle circle = new Circle(new Point(5, 2), 5);
        assertEquals(31.41592653589793, circle.getPerimeter(),DELTA);
    }

}
