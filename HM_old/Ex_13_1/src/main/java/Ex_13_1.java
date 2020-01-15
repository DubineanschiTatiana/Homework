
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class Ex_13_1 {

    public static void main(String... args) {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.addAll(Arrays.asList(1, 2, 3, 4, 5));
        
        //for loop
        System.out.println("For loop method: ");
        for (int i = 0; i < myList.size(); i++) {
            System.out.print(myList.get(i));
        }
        
        //enhanced for loop
        System.out.println("\nEnhanced for loop: ");
        for (Integer i : myList) {
            System.out.print(i);
        }
        
        //iterator
        ListIterator<Integer> it = myList.listIterator();
        System.out.println("\nIterator: ");
        while (it.hasNext()){
            System.out.print(it.next());}
        
        //while loop
        int i=0;
        System.out.println("\nWhile loop: ");
        while (i<5){
        System.out.print(myList.get(i));
        i++;}
    }
}
