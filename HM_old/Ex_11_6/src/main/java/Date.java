public class Date {
private int month;
private int day;
private int year;
Date(int month, int day, int year){
setMonth(month);
setDay(day);
setYear(year);
}

    public void setMonth(int month) {
        if (month>0&&month<12) this.month = month;
        else System.out.println("Wrong Month");
    }

    public void setDay(int day) {
        if (day>0&&day<31) this.day = day;
        else System.out.println("Wrong Day");
    }

    public void setYear(int year) {
        if (year>0)
        this.year = year;
    }

void displayDate(){
    System.out.println(this.month+"/"+this.day+"/"+this.year);
}
}
