
import java.util.Scanner;

public class Main {
//  Write a Java program to ﬁnd the index of an array element.
    
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce number of rows:");
        int r = sc.nextInt();
        System.out.println("Introduce number of columns:");
        int c = sc.nextInt();
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
        System.out.println("Enter element to find index: ");
        int v = sc.nextInt();
        System.out.println("\nIndex of array element: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (array[i][j] == v) {
                    System.out.printf("\n Row [%d] Column [%d];", i, j);
                }
            }
        }
    }
}
