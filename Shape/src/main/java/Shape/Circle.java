package Shape;

public class Circle extends Shape {
private Point center;
private int radius;

    public Circle(Point point, int radius) {
        this.center = point;
        this.radius = radius;
    }
    
    public double getDiameter() {
    return radius*2;
    }
    
@Override
    public double getSurface() {
    return Math.PI*radius*radius;
    }
    
@Override
    public double getPerimeter() {
    return Math.PI*getDiameter();
    }
    
    @Override
    public void move(double dx, double dy) {
      center.setX(center.getX()+dx);
      center.setY(center.getY()+dy);
    }
    
    @Override
    public String toString() {
    return "Center "+this.center+"\nRadius "+this.radius;
    }
    
}
