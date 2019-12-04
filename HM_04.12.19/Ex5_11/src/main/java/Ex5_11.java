
import java.util.Scanner;

public class Ex5_11 {

    public static void main(String... arg) {
        Scanner sc = new Scanner(System.in);
        int n;
        int n2;
        // Display numbers in ascending order
        do {
            System.out.println("Enter number:");
            n = sc.nextInt();
        } while (n < 0);

        System.out.println("Numbers in the ascending order:");
        for (int i = 1; i < n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        //---------------------------------------------------------
        // Display numbers in descending order:
        do {
            System.out.println("\nEnter number:");
            n2 = sc.nextInt();
        } while (n < 0);

        System.out.println("\nNumbers in the descending order:");
        for (int i = n2 - 1; i >= 1; i--) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

    }
}
