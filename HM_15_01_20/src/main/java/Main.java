
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Main {

    public static void main(String... args) {

        //EX 14.1.4
        LocalDate date = LocalDate.now();
        System.out.println("10 days before: " + date.minusDays(10));
        System.out.println("10 days after: " + date.plusDays(10));

        //EX 14.1.5
        String d = "Jan 1, 2020";
        LocalDate date1 = LocalDate.parse(d, DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).withLocale(Locale.US));
        System.out.println(date1);

        //EX 14.1.6
        LocalDate myBirthday = LocalDate.of(1995, 06, 29);
        Period age = Period.between(myBirthday, LocalDate.now());
        System.out.println("My Age: " + age.getYears());
    }
}
