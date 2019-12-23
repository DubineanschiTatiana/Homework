
import java.util.Scanner;


public class Array {

    int[] items;
    
    /*public void init() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Length of array: ");
        items = new int[sc.nextInt()];
        for (int i=0;i<items.length;i++) {
            System.out.println("Introduce element number:"+i);
            items[i]=sc.nextInt();       
        }
    }
*/
    void sum() {
        int sum = 0;
        for (int i = 0; i < items.length; i++) {
            sum += items[i];
        }
        System.out.println("Summ: " + sum);
    }

    void average() {
        int sum = 0;
        double avg = 0;
        for (int i = 0; i < items.length; i++) {
            sum += items[i];
        }
        avg = (double) sum / items.length;
        System.out.println("\nAverage: " + avg);
    }

    void even() {
        System.out.println("\nEven numbers: ");
        for (int i = 0; i < items.length; i++) {
            if (items[i] % 2 == 0) {
                System.out.print(items[i] + " ");
            }
        }
    }

    void odd() {
        System.out.println("\nOdd numbers: ");
        for (int i = 0; i < items.length; i++) {
            if (items[i] % 2 != 0) {
                System.out.print(items[i] + " ");
            }
        }
    }

    void length() {
        System.out.println("Length: " + items.length);
    }
}
