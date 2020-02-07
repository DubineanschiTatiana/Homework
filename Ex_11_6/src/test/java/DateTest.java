
import org.junit.Test;
import CalendarDate.Date;
import CalendarDate.DateFormatException;
import static org.junit.Assert.*;

public class DateTest {

    @Test
    public void testSetDay1() throws DateFormatException {
        Date date = new Date();
        date.setDay(1);
        assertEquals(1, date.getDay());

    }

    @Test
    public void testSetDay0() {
        try {
            Date date = new Date();
            date.setDay(1);
        } catch (DateFormatException e) {
            assertEquals("Wrong Day", e.getMessage());
        };
    }

    @Test
    public void testSetDay31() throws DateFormatException {
        Date date = new Date();
        date.setDay(31);
        assertEquals(31, date.getDay());

    }

    @Test
    public void testSetDay32() {
        try {
            Date date = new Date();
            date.setDay(32);
        } catch (DateFormatException e) {
            assertEquals("Wrong Day", e.getMessage());
        }
    }

    @Test
    public void testSetMonth1() throws DateFormatException {
        Date date = new Date();
        date.setMonth(1);
        assertEquals(1, date.getMonth());

    }

    @Test
    public void testSetMonth0() {
        try {
            Date date = new Date();
            date.setMonth(1);
        } catch (DateFormatException e) {
            assertEquals("Wrong Month", e.getMessage());
        }
    }

    @Test
    public void testSetMonth12() throws DateFormatException {
        Date date = new Date();
        date.setMonth(12);
        assertEquals(12, date.getMonth());

    }

    @Test
    public void testSetMonth13() {
        try {
            Date date = new Date();
            date.setMonth(13);
        } catch (DateFormatException e) {
            assertEquals("Wrong Month", e.getMessage());
        };
    }

    @Test
    public void testSetYear1900() throws DateFormatException {
        Date date = new Date();
        date.setYear(1900);
        assertEquals(1900, date.getYear());

    }

    @Test
    public void testSetYear1899() {
        try {
            Date date = new Date();
            date.setYear(1899);
        } catch (DateFormatException e) {
            assertEquals("Wrong Year", e.getMessage());
        }
    }

    @Test
    public void testSetYear2100() throws DateFormatException {
        Date date = new Date();
        date.setYear(2100);
        assertEquals(2100, date.getYear());
    }

    @Test
    public void testSetYear2101() {
        try {
            Date date = new Date();
            date.setYear(2101);
        } catch (DateFormatException e) {
            assertEquals("Wrong Year", e.getMessage());
        }
    }

    @Test
    public void testDisplayDate() throws DateFormatException {
        Date date = new Date();
        date.setDay(1);
        date.setMonth(1);
        date.setYear(2020);
        assertEquals("1/1/2020", date.displayDate());

    }
}

