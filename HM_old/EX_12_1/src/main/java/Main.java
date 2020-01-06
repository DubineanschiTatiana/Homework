
public class Main {

    public static void main(String[] args) {
        StringBuilder s2 = new StringBuilder("This is StringBuilder Object!");
        s2.append(" :D ");
        

        StringBuilder s3 = new StringBuilder("moon#night");
        int index = s3.indexOf("#");
        System.out.println("12.4.2. :" + (s3.charAt(index - 1) == s3.charAt(index + 1)));
        
        // 12.4.3
        
        StringBuilder s4 = new StringBuilder("welcome");
        System.out.println("12.4.3 :"+dublicateLetter(s4));
    }
        static StringBuilder dublicateLetter(StringBuilder s){
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            s = s.insert(i + 1, c);
            i++;
        }
        return s;}
        
        
        //12.4.4
        
        static StringBuilder findTriples(StringBuilder s) {
            
            
        
        }
}
       

