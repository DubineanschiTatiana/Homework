
import java.util.Scanner;

public class Ex6_3_1 {
// Sum and average of one dimensional array

    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce length of array:");
        int l = sc.nextInt();
        int[] array = new int[l];
        int sum = 0;
        double avg = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Enter element from position %d:\n", i);
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
            sum += array[i];
        }

        System.out.println("\nSum :" + sum);
        avg = (double) sum / (double) l;
        System.out.println("Average :" + avg);
    }

}
