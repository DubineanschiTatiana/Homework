
import java.util.ArrayList;
import java.util.Arrays;

public class Ex_13_4 {

    public static void main(String... args) {
        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("Cats", "dogs", "pets", "parrot", "crocodile"));
        ArrayList<String> newList2 = markLength4(list);
        System.out.println(Arrays.toString(newList2.toArray()));
    }

    public static ArrayList<String> markLength4(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if (s.length() == 4) {
                s = "****" + s;
            }
            list.set(i, s);
        }
        return list;
    }
}
