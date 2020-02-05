
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InvalidRangeException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter min: ");
        int min = sc.nextInt();
        System.out.println("Enter max: ");
        int max = sc.nextInt();
        int count = 0;
        try {
            if (min >= max) {
                throw new InvalidRangeException("Invalid range: min is greater than or equal to maximum!!");
            } else {
                for (int i = min; i <= max; i++) {
                    if (i % 7 == 0) {
                        count++;
                    }
                }
                System.out.println("Numbers devisible by 7: " + count);
            }
        } catch (InvalidRangeException e) {
            System.out.println(e.getMessage());
        }

    }
}
