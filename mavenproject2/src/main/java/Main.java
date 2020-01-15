
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import javax.swing.text.DateFormatter;


public class Main {
public static void main(String ... args) {
LocalDateTime dateTime=LocalDateTime.now();
    System.out.println(dateTime.format(DateTimeFormatter.ofPattern("D.M.Y H:m:s")));
    
    dateTime=dateTime.plusHours(2);
    System.out.println(dateTime.format(DateTimeFormatter.ofPattern("D.M.Y H:m:s")));
    
    LocalDate date1=LocalDate.of(2020,12,1);
    LocalDate date2=LocalDate.of(2019,10,4);
    
    Period period=Period.between(date2, date1);
    System.out.println(period.getYears()+" years "+period.getMonths()+" months "+period.getDays()+" days ");
    
    Period p=Period.of(date1.getYear(),date1.getMonthValue(), date1.getDayOfMonth());
    System.out.println(date2.minus(p));
    
 
    
    
}    
}
