public class Rectangle extends Polygon {

    public Rectangle(Point topRightCorner, int width, int height) {
    Point topleftCorner=new Point(topRightCorner.getX()-width,topRightCorner.getY());
    Point bottomLeftCorner=new Point(topleftCorner.getX(),topleftCorner.getY()-height);
    Point bottomRigthCorner=new Point(bottomLeftCorner.getX()+width,bottomLeftCorner.getY());
    
    vertices =new Point[4];
    vertices[0]=topRightCorner;
    vertices[1]=topleftCorner;
    vertices[2]=bottomLeftCorner;
    vertices[3]=bottomRigthCorner;
    }


    @Override
    public void move(double dx, double dy) {
        super.move(dx, dy);
    }

    @Override
    public double getSurface() {
       double width=vertices[1].determineDistance(vertices[0]);
       double heigth=vertices[0].determineDistance(vertices[3]);
       return width*heigth;
    }

    @Override
    public double getPerimeter() {
        return super.getPerimeter();
    }

    @Override
    public void setColor(Color color) {
       this.color=color;
    }
    
    


}
