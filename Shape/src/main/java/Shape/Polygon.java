package Shape;


import java.util.Arrays;

public abstract class Polygon extends Shape {

    protected Point[] vertices;

    @Override
    public String toString() {
        return "Vertices" + Arrays.toString(vertices);
    }

    @Override
    public void move(double dx, double dy) {
        for (Point point : vertices) {
            point.move(dx, dy);
        }
    }


@Override
    public double getPerimeter() {
        double perimeter = 0.0;
        for (int index = 0; index < vertices.length - 1; index++) {
            double distance = vertices[index].determineDistance(vertices[index + 1]);
            perimeter += distance;
        }
        perimeter += vertices[vertices.length - 1].determineDistance(vertices[0]);
        return perimeter;
    }

}
