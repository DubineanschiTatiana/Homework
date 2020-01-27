
import java.util.ArrayList;
import java.util.Arrays;

public class Rectangle extends Polygon {

    public Rectangle(Point topRightCorner, int width, int height) {
        Point topleftCorner = new Point(topRightCorner.getX() - width, topRightCorner.getY());
        Point bottomLeftCorner = new Point(topleftCorner.getX(), topleftCorner.getY() - height);
        Point bottomRigthCorner = new Point(bottomLeftCorner.getX() + width, bottomLeftCorner.getY());

        vertices = new ArrayList<Point>();
        vertices.add(topRightCorner);
        vertices.add(topleftCorner);
        vertices.add(bottomLeftCorner);
        vertices.add(bottomRigthCorner);
    }

    
    
}
