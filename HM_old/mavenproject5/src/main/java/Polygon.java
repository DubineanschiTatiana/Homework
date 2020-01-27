
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

abstract class Polygon implements IMovable {
   protected List<Point> vertices=new ArrayList<Point>();
  @Override
    public void moveUp(int distance) {
    for (int i = 0; i < vertices.size(); i++) {
            Point x = vertices.get(i);
            x.setY(x.getY() + distance);
        }
    }

    @Override
    public void moveDown(int distance) {
    for (Point point:vertices) {
            point.setY(point.getY() + distance);
        }
    }

    @Override
    public void moveLeft(int distance) {
    for (Point point:vertices) {
            point.setX(point.getX() - distance);
        }
    }

    @Override
    public void moveRight(int distance) {
    for (Point point:vertices) {
            point.setX(point.getX() + distance);
        }
    }
    
    @Override
   public String toString(){
   return getClass().getName()+":"+Arrays.toString(vertices.toArray());
   }  
}
