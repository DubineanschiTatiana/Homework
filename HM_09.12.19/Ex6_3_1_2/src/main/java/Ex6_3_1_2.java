
import java.util.Scanner;

public class Ex6_3_1_2 {
// Sum and average of two dimensional array
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce number of rows:");
        int r = sc.nextInt();
        System.out.println("Introduce number of columns:");
        int c = sc.nextInt();
        int[][] array = new int[r][c];
        int sum = 0;
        double avg = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.printf("Enter element from position row [%d] column [%d]: \n", i, j);
                array[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(array[i][j] + " ");
                sum += array[i][j];
            }
            System.out.println("");
        }
        System.out.println("Sum :" + sum);
        avg = (double) sum / (double) (r * c);
        System.out.println("Average :" + avg);
    }
}
