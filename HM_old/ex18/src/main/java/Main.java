
public class Main {

    public static void main(String[] args) {
        
        NumValidating greater0 = number -> number > 0;
        int n1 =10;
        System.out.println("Is " + n1 + " greater than 0: " + greater0.validate(n1));
        NumValidating less0 = number -> number <0;
        System.out.println("Is " + n1 + " less than 0: " + less0.validate(n1));
        NumValidating equal0 = number -> number == 0;
        System.out.println("Is " + n1 + " equal to 0: " + equal0.validate(n1));
        NumValidating even = number -> number%2==0;
        System.out.println("Is " + n1 + " even: " + even.validate(n1));
        NumValidating odd = number -> number%2!=0;
        System.out.println("Is " + n1 + " odd: " + odd.validate(n1));
        
        System.out.println("Predicate: ");
        Predicate<Integer> greaterZero=n ->n >0;
        System.out.println("Is " + n1 + " greater than 0: " + greaterZero.test(n1));
        Predicate<Integer> lessZero=n ->n <0;
        System.out.println("Is " + n1 + " less than 0: " + lessZero.test(n1));
        Predicate<Integer> equalZero=n ->n ==0;
        System.out.println("Is " + n1 + " equal to 0: "  + equalZero.test(n1));
        Predicate<Integer> evenN=n ->n %2==0;
        System.out.println("Is " + n1 + " even: "  + evenN.test(n1));
        Predicate<Integer> oddN=n ->n %2!=0;
        System.out.println("Is " + n1 +" even: "   + oddN.test(n1));
        
        //18.2
        String words="Java knowledge";
        StringValidator contains=s->s.contains("knowledge");
        System.out.println("Contains the string knowledge : "+ contains.validate(words));
        StringValidator lengthGreater10=s->s.length()>10;
        System.out.println("Has a length greater than 10: "+ lengthGreater10.validate(words));
        StringValidator notNull=s->s!=null;
        System.out.println("Is not null: "+ notNull.validate(words));
        StringValidator emptySpace=s->!s.contains(" ");
        System.out.println("Is not a String full of empty spaces: "+ emptySpace.validate(words));
        
        Predicate<String> containsP=s->s.contains("knowledge");
        System.out.println("Contains the string knowledge : "+ containsP.test(words));
        Predicate<String>  lengthGreater10P=s->s.length()>10;
        System.out.println("Has a length greater than 10: "+ lengthGreater10P.test(words));
        Predicate<String> notNullP=s->s!=null;
        System.out.println("Is not null: "+ notNullP.test(words));
        Predicate<String>  emptySpaceP=s->!s.contains(" ");
        System.out.println("Is not a String full of empty spaces: "+ emptySpaceP.test(words));
        
        
    }

}
