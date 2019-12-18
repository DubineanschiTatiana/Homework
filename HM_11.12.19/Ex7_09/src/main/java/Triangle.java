
public class Triangle {

    Point p1 = new Point();
    Point p2 = new Point();
    Point p3 = new Point();

    void determineType() {
        double a = Math.sqrt(Math.pow((p1.x - p2.x), 2) + Math.pow((p1.y - p2.y), 2));
        double b = Math.sqrt(Math.pow((p2.x - p3.x), 2) + Math.pow((p2.y - p3.y), 2));
        double c = Math.sqrt(Math.pow((p3.x - p1.x), 2) + Math.pow((p3.y - p1.y), 2));
        System.out.println("a: " + a + " b: " + b + " c: " + c);

        if (a + b > c && a + c > b && c + b > a) {
            if (a == b && b == c) {
                System.out.println("Equilateral");
            } else if (a == b || b == c || a == c) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }
        } else {
            System.out.println("It's not a triangle");
        }
    }
}
