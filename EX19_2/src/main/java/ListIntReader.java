
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ListIntReader {

    List<Integer> list = new ArrayList<>();

    public void readInt() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter message: ");
        String message = sc.nextLine();
        List<String> stringList = Arrays.asList(message.split("\\s*,\\s*"));
        for (String number : stringList) {
            try {
                list.add(Integer.parseInt(number));
            } catch (NumberFormatException nfe) {
            }
        }
    }

    public void print() {
        System.out.println("List of integers: ");
        list.forEach(System.out::println);
    }

    public void sum() {
        System.out.println("Sum of integer in list:" + list.stream().mapToInt(Integer::intValue).sum());
    }
}
