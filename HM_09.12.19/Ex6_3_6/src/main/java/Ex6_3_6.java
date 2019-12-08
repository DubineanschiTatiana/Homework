
import java.util.Scanner;

public class Ex6_3_6 {
// Write a Java program to ﬁnd the number of even and odd integers in a given array of integers.
    
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce number of rows:");
        int r = sc.nextInt();
        System.out.println("Introduce number of columns:");
        int c = sc.nextInt();
        int e = 0;
        int o = 0;

        int[][] array = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.printf("Enter element from position row [%d] column [%d]: \n", i, j);
                array[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (array[i][j] % 2 == 0) {
                    e++;
                } else {
                    o++;
                }
            }
        }
        System.out.println("Even numbers:" + e + " Odd numbers:" + o);
    }
}
