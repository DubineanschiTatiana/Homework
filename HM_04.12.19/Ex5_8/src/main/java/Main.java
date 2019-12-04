import java.util.Scanner;

public class Main {

    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter operator: ");
        char op = sc.next().charAt(0);
        System.out.println("Enter number 1: ");
        double n1 = sc.nextDouble();
        System.out.println("Enter number 2: ");
        double n2 = sc.nextDouble();
        double result = 0;

        switch (op) {
            case '+':
                result = n1 + n2;
                break;
            case '-':
                result = n1 - n2;
                break;
            case '*':
                result = n1 * n2;
                break;
            case '/':
                result = n1 / n2;
                break;
            default:
                System.out.println("Impossible operation! Try again...");
        }
        System.out.printf("%.2f %c %.2f = %.2f", n1, op, n2, result);
    }

}
