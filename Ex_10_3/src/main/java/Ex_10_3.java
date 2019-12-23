
import java.util.Scanner;

public class Ex_10_3 {

    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce Fahrenheit temperature:");
        double F = sc.nextDouble();
        System.out.println("Celsius: " + convert(F));

    }

    public static double convert(double F) {
        return (5 * (F - 32)) / 9;
    }
}
