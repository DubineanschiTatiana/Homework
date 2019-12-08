
import java.util.Scanner;

public class Main {
// Write a Java program to check if two arrays are equal: check both the length and the values.

    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        boolean s = true;
        System.out.println("Introduce number of rows of 1st array:");
        int r = sc.nextInt();
        System.out.println("Introduce number of columns of 1st array:");
        int c = sc.nextInt();
        int[][] array = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.printf("Enter element from position row [%d] column [%d]: \n", i, j);
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println("Introduce number of rows of 2nd array:");
        int r1 = sc.nextInt();
        System.out.println("Introduce number of columns of 2nd array:");
        int c1 = sc.nextInt();
        int[][] array2 = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                System.out.printf("Enter element from position row [%d] column [%d]: \n", i, j);
                array2[i][j] = sc.nextInt();
            }
        }
        if (r == r1 && c == c1) {
            exit:
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    if (array[i][j] != array2[i][j]) {
                        s = false;
                        break exit;
                    } else {
                        s = true;
                    }
                }
            }
        } else {
            s = false;
        }

        System.out.println("------------Message------------");
        if (s == true) {
            System.out.println("Arrays are EQUAL!");
        } else {
            System.out.println("Arrays are NOT equal!");
        }
    }
}
