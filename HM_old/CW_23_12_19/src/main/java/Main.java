
public class Main {

    public static void main(String[] args) {
        String s = "Let's go home, it's late already!";
        System.out.println("Char at index 6: "+s.charAt(6));
        System.out.println("Char at index 10: "+s.charAt(10));
        System.out.println("Does it contains late? "+s.contains("late"));
        System.out.println(s.startsWith("L"));
        System.out.println(s.endsWith("y"));
        String s2="Let's go home, it's late already!";
        System.out.println(s.equals(s2));
        System.out.println(s.equalsIgnoreCase(s2));
        
    }
}
