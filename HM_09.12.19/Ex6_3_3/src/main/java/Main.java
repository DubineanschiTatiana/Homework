
import java.util.Scanner;

public class Main {

    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce number of rows:");
        int r = sc.nextInt();
        System.out.println("Introduce number of columns:");
        int c = sc.nextInt();
        int[][] array = new int[r][c];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.printf("Enter element from position row [%d] column [%d]: \n", i, j);
                array[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Search for value : ");
        int v = sc.nextInt();
        int n = 0;//number of copies
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] == v) {
                    n++;
                }
            }
        }
        System.out.println("Program found ["+ n + "] search results for your request!");
    }
}
