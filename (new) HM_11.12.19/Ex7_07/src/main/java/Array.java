
public class Array {

    int[] items;

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
        System.out.println("Average: " + avg);
    }

    void even() {
        System.out.println("Even numbers: ");
        for (int i = 0; i < items.length; i++) {
            if (items[i] % 2 == 0) {
                System.out.print(items[i] + " ");
            }
        }
    }

    void odd() {
        System.out.println("Odd numbers: ");
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
