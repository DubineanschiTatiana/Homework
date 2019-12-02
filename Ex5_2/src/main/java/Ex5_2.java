import java.util.Scanner;

public class Ex5_2 {

    public static void main(String... arg) {

        Scanner input = new Scanner(System.in);

        // Introduce values of three numbers
        System.out.println("Please introduce value of a: ");
        int a = input.nextInt();
        System.out.println("Please introduce value of b: ");
        int b = input.nextInt();
        System.out.println("Please introduce value of c: ");
        int c = input.nextInt();

        // First method with if-else construct
        System.out.println("1ST METHOD: ");
        if (a <= b && b <= c) {
            System.out.println("Smallest number is " + a);
        } else if (b <= c && c <= a) {
            System.out.println("Smallest number is " + b);
        } else {
            System.out.println("Smallest number is " + c);
        }

        // Second method with ternary construction
        System.out.println("2SD METHOD: ");
        int min = (a <= b && b <= c) ? a : (b <= c && c <= a) ? b : c;
        System.out.println("Smallest number is " + min);

    }
}
