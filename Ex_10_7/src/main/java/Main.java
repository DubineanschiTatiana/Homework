
import java.util.Scanner;

public class Main {

    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce number:");
        int n = sc.nextInt();
        squareOfAsteriks(n);
    }

    public static void squareOfAsteriks(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
