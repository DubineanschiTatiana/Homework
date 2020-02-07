package Shape;


public class Triangle extends Polygon {

    public Triangle(Point cornerOne, Point cornerTwo, Point cornerThree) {
        vertices = new Point[3];
        vertices[0] = cornerOne;
        vertices[1] = cornerTwo;
        vertices[2] = cornerThree;
    }

    @Override
    public String toString() {
        return "List of vertices: ";
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }

    ;
    
    @Override
    public double getPerimeter() {
        return super.getPerimeter();
    }

    @Override
    public void move(double dx, double dy) {
        super.move(dx, dy);
    }

    @Override
    public double getSurface() {
        double perimeter = super.getPerimeter();
        double s = perimeter / 2;
        double a = vertices[0].determineDistance(vertices[1]);
        double b = vertices[1].determineDistance(vertices[2]);
        double c = vertices[2].determineDistance(vertices[0]);
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
        
    }

    public boolean isIsoscel() {
        double a = vertices[0].determineDistance(vertices[1]);
        double b = vertices[1].determineDistance(vertices[2]);
        double c = vertices[2].determineDistance(vertices[0]);
        return a == b || b == c || a == c;

    }

    public boolean isEquilateral() {
        double a = vertices[0].determineDistance(vertices[1]);
        double b = vertices[1].determineDistance(vertices[2]);
        double c = vertices[2].determineDistance(vertices[0]);
        return a == b && b == c && a == c;
    }

    public boolean isRight() {
        double a = vertices[0].determineDistance(vertices[1]);
        double b = vertices[1].determineDistance(vertices[2]);
        double c = vertices[2].determineDistance(vertices[0]);

        return a==Math.sqrt(b*b+c*c)|| b==Math.sqrt(a*a+c*c) || c==Math.sqrt(a*a+a*a);

    }

}
/*
 public boolean isRight() {
        return vertices[0].getX() == vertices[1].getX() && vertices[0].getY() == vertices[1].getY()
                || vertices[0].getY() == vertices[1].getY() && vertices[1].getX() == vertices[2].getX()
                || vertices[0].getY() == vertices[2].getY() && vertices[1].getX() == vertices[2].getX();

    }*/
