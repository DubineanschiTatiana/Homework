
import java.util.Scanner;

public class Ex5_3_3 {

    public static void main(String... args) {
        Scanner input = new Scanner(System.in);
// Triangle
        System.out.println("Please introduce a: ");
        double a = input.nextInt();
        System.out.println("Please introduce b: ");
        double b = input.nextInt();
        System.out.println("Please introduce c: ");
        double c = input.nextInt();
        if (a + b >= c && a + c >= b && b + c >= a) {
            if (a == b && b == c) {
                System.out.println("Equilateral Triangle");
            } else if (a == b || b == c || a == c) {
                System.out.println("Isoscel Triangle");
            } else {
                System.out.println("Scalene Triangle");
            }
        } else {
            System.out.println("Not a valid triangle!");
        }
    }
}
