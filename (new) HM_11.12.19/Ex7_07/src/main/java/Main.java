
import java.util.Scanner;

public class Main {
    public static void main(String ... args){
        Array a=new Array();
        //a.items=new int[] {1,2,3,4,5,6};
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce length: ");
        a.items=new int[sc.nextInt()];
        for (int i=0;i<a.items.length;i++){
            System.out.println("Introduce element number:"+i);
            a.items[i]=sc.nextInt();
        }
        
        //a.init();
        a.sum();
        a.average();
        a.even();
        a.odd();
        
    
    }
    
}
