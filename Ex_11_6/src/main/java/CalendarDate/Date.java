package CalendarDate;

import java.util.Calendar;

public class Date {

    private int month;
    private int day;
    private int year;

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    public void setMonth(int month) throws DateFormatException {
        if (!(month > 0 && month <= 12)) {
            throw new DateFormatException("Wrong Month");
        }
        this.month = month;
    }

    public void setDay(int day) throws DateFormatException {
        if (!(day > 0 && day <= 31)) {
            throw new DateFormatException("Wrong Day");
        }
        this.day = day;
    }

    public void setYear(int year) throws DateFormatException {
        if (!(year >= 1900 && year <= 2100)) {
            throw new DateFormatException("Wrong Year");
        }
        this.year = year;

    }

    public String displayDate() {
        return this.month + "/" + this.day + "/" + this.year;
    }
}
