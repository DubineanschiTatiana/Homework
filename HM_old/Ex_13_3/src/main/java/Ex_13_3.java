
import java.util.ArrayList;
import java.util.Arrays;

public class Ex_13_3 {

    public static void main(String... args) {
        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("Cats", "DOGS", "pets", "parrot", "crocodile"));
        ArrayList<String> newList2 = switchPair(list);
        System.out.println(Arrays.toString(newList2.toArray()));
    }

    public static ArrayList<String> switchPair(ArrayList<String> list) {
        int l;
        if (list.size() % 2 == 0) {
            l = list.size();
        } else {
            l = list.size() - 1;
        }

        for (int i = 0; i < l; i += 2) {
            String temp = list.get(i);
            list.set(i, list.get(i + 1));
            list.set(i + 1, temp);
        }

        return list;

    }
}
