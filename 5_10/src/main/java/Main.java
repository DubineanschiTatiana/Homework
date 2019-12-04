
import java.util.Scanner;

public class Main{
    public static void main(String... arg) {
        Scanner sc = new Scanner(System.in);
        
        // Display numbers in ascending order
        System.out.println("Enter number:");
        int n = sc.nextInt();
        System.out.println("Numbers in the ascending order:");
        for (int i = 1; i < n; i++) {
            System.out.print(i + " ");
        }
        
        //---------------------------------------------------------
         
        // Display numbers in ascending order
        System.out.println("\nNumbers in the descending order:");
        System.out.println("Enter number:");
        int n2 = sc.nextInt();
        for (int i = n2-1 ; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }
 
}
