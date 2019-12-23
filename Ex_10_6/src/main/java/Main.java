
import java.util.Scanner;

public class Main {

    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int n1;
        int n2;
            System.out.println("Introduce pair of integer:");
            System.out.println("1st:");
            n1 = sc.nextInt();
            System.out.println("2nd:");
            n2 = sc.nextInt();
            System.out.println("Is 2nd number multiple of 1st: " + isMultiple(n1, n2));
    }

    public static boolean isMultiple(int n1, int n2) {
        return n2 % n1 == 0;
    }

}
