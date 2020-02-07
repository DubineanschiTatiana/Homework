package Shape;

public class Square extends Rectangle {

    public Square(Point topRightCorner, int sideLength) {
        super(topRightCorner, sideLength, sideLength);
    }
        @Override
    public String toString(){
    return "list of Vertices";}


    @Override
    public void move(double dx, double dy) {
        super.move(dx, dy);
    }

    @Override
    public double getSurface() {
        return super.getSurface();
    }

    @Override
    public double getPerimeter() {
        return super.getPerimeter();
    }

   
}
