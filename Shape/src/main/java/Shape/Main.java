package Shape;

public class Main {

    public static void main(String[] args) {
        
        // Dreptunghi
        System.out.println("Rectangle Data:");
        Point p = new Point(5, 5);
        Rectangle r = new Rectangle(p, 3, 2);
        System.out.println("First " + r);
        System.out.println("Perimeter: " + r.getPerimeter());
        System.out.println("Surface:  " + r.getSurface());
        r.move(10, 12);
        System.out.println("After move:" + r);
        
        // Triunghi
        System.out.println("Triangle Data:");
        Triangle t = new Triangle(new Point(10, 3), new Point(10, 6), new Point(13, 3));
        System.out.println("Perimeter: " + t.getPerimeter());
        System.out.println("Surface:  " + t.getSurface());
        System.out.println("Is equilateral: " + t.isEquilateral());
        System.out.println("Is isoscel: " + t.isIsoscel());
        System.out.println("Is right: " + t.isRight());
        
        //
        Circle circle = new Circle(new Point(5,2),5);
        System.out.println(circle.getPerimeter());
        Rectangle rect = new Rectangle(new Point(5, 2), 5,2);
        System.out.println(rect.getPerimeter());
        System.out.println(rect.getSurface());
    }
}
