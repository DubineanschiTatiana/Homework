
import java.util.Scanner;

public class Ex6_3_5 {

    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce number of rows of 1st array:");
        int r = sc.nextInt();
        System.out.println("Introduce number of columns of 1st array:");
        int c = sc.nextInt();

        int[][] array = new int[r][c];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.printf("Enter element from position row [%d] column [%d]: \n", i, j);
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nArray to copy:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("Introduce number of rows of 2nd array:");
        int r1 = sc.nextInt();
        System.out.println("Introduce number of columns of 2nd array:");
        int c1 = sc.nextInt();
        int[][] array2 = new int[r1][c1];
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array2[i][j] = array[i][j];
            }
        }

        System.out.println("\nCopied array:");
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                System.out.print(array2[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
