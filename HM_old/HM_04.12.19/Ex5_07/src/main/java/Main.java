
import java.util.Scanner;

public class Main {

    public static void main(String... arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter weekday: ");
        String wd = sc.nextLine();
        String result = "";
        switch (wd.toUpperCase()) {
            case "FRI":
                result ="FRI";
            case "THU":
            case "WED":result ="WED";
            case "TUE":
                result = "MON";
                break;
            case "MON":
            break;
            default:
                System.out.println("No Lessons!");
                break;
        }
        System.out.println(result);
    }
}
