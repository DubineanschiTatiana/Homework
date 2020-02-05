
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InvalidHexException {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter message: ");
            String s = sc.nextLine();
            if (!s.matches("[0-9A-F]+")) {
                throw new InvalidHexException("Not a hexadecimal number!");
            }
        } catch (InvalidHexException e) {
            System.out.println(e.getMessage());
        }

    }
}
