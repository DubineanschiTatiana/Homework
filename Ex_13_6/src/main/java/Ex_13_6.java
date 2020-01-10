
import java.util.ArrayList;
import java.util.Arrays;

public class Ex_13_6 {

    public static void main(String... args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 5));
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1, 2, 4, 5));

        ArrayList<String> newList2 = intersect(list, list2);
        System.out.println(Arrays.toString(newList2.toArray()));
    }

    public static ArrayList<String> intersect(ArrayList<Integer> list, ArrayList<Integer> list2) {
        ArrayList<String> intersect = new ArrayList<>();
        for (Integer number : list) {
            for (Integer number2 : list2) {
                if (number.equals(number2)) {
                    intersect.add(number.toString());
                }

            }
        }
        return intersect;
    }
}
