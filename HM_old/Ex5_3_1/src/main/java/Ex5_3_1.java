
import java.util.Scanner;

public class Ex5_3_1 {

    public static void main(String... args) {
        Scanner input = new Scanner(System.in);

// Positive or Negative Number 
        System.out.println("Please introduce number: ");
        int n = input.nextInt();
        if (n >= 0) {
            System.out.println("Positive number");
        } else {
            System.out.println("Negative number");
        }
    }
}
