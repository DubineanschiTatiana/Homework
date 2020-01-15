
import java.util.ArrayList;
import java.util.Arrays;

public class Ex_13_2 {

    public static void main(String... args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> list2 = new ArrayList<>(list1);
        list2.clear();
        list1.set(2, list1.get(1));
        System.out.println(Arrays.toString(list1.toArray()));

        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("Cats", "DOGS", "pets", "parrot"));
        ArrayList<String> newList = removePlurals(list);
        System.out.println(Arrays.toString(newList.toArray()));
        ArrayList<String> newList2 = reverseString(list);
        System.out.println(Arrays.toString(newList2.toArray()));

        ArrayList<String> list3 = new ArrayList<>();
        list.addAll(Arrays.asList("Cats", "DOGS", "pets", "parrot"));
        ArrayList<String> list4 = new ArrayList<>();
        list.addAll(Arrays.asList("Cats", "DOGS", "pet", "parrot"));

//        System.out.println(compare(list3, list4));
    }

    public static ArrayList<String> removePlurals(ArrayList<String> list) {
        
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            String last = s.toLowerCase().substring(s.length() - 1);
            if ("s".equals(last)) {
                list.remove(i);
            }
            System.out.println(last);
        }
        return list;
    }

    public static ArrayList<String> reverseString(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(list.get(i));
            sb.reverse();
            list.set(i, sb.toString());
        }
        return list;
    }
    
    public static boolean compare(ArrayList<String> list, ArrayList<String> list2) {
        if (list.size() != list2.size()) {
            for (int i = 0; i < list.size(); i++) {
                if (!list.get(i).equals(list2.get(i))) {
                    return false;
            }
                return true;
            
        }
            return false;
    
  
}}}

