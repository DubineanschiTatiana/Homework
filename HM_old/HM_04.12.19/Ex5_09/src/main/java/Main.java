
import java.util.Scanner;

public class Main{

    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dear user, please enter mark: ");
        int m = sc.nextInt();
        String result = null;
        switch (m) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:result="Fail!";break;
            case 5:result="Approved";break;
            case 6:result="Good";break;
            case 7:
            case 8:result="Very good!";break;
            case 9:        
            case 10:result="I'm proud of you!";break;      
            default : System.out.println("Impossible mark! Try again ...");
        }
        System.out.println(result);
    }
}
