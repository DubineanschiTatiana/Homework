public class Ex11_5_1{
public static void main(String ... args) {
Holiday h1=new Holiday("Craciun",25,"Decembrie");
Holiday h2=new Holiday("Ajun Anul Nou",31,"Decembrie");
    System.out.println(h1.isSameMonth(h2.getMonth()));
    System.out.println(avgDate(h1,h2));
}    
}
