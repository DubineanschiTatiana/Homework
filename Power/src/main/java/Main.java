
public class Main {

    public static void main(String... args) {
        System.out.println("Result: " + integerPower(4, -2));
    }

    static double integerPower(int base, int exponent) {
        int i = 1;
        if (exponent == 0) {
            return 1;
        } else if (exponent > 0) {
            while (i < exponent) {
                base *= base;
                i++;

            }
            return base;
        } else {
            exponent = exponent * (-1);
            while (i < exponent) {
                base *= base;
                i++;
            }
            return 1 / (double) base;
        }
    }
}