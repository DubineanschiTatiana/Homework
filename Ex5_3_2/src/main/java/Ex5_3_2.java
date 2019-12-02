
import java.util.Scanner;

public class Ex5_3_2 {

    public static void main(String... args) {
        Scanner input = new Scanner(System.in);

// Solve quadratic equations
        System.out.println("Please introduce a: ");
        double a = input.nextDouble();
        System.out.println("Please introduce b: ");
        double b = input.nextDouble();
        System.out.println("Please introduce c: ");
        double c = input.nextDouble();
        double x1;
        double x2;
        // Find determinant 
        double d = b * b - 4 * a * c;
        if (d > 0) {
            x1 = (-b - Math.sqrt(d)) / 2 * a;
            x2 = (-b + Math.sqrt(d)) / 2 * a;
            System.out.println("Root 1: " + x1 + "\nRoot 2: " + x2);
        } else if (d == 0) {
            x1 = x2 = -b / (2 * a);
            System.out.println("Root 1: " + x1 + "\nRoot 2: " + x2);
        } else {
            double real = -b / 2 * a;
            double imag = Math.sqrt(-d) / 2 * a;
            System.out.println("Root 1: " + real + "+" + imag + "i" + "\nRoot 2: " + real + "-" + imag + "i");
        }
    }
}
