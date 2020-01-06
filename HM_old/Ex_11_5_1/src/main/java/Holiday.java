public class Holiday {
private String name;
private int day;
private String month;

Holiday(String name, int day, String month){
this.name=name;
this.day=day;
this.month=month;
}
public String getMonth(){
return month;}

public boolean isSameMonth(Holiday ){
    return this.month.equals(monthToCompare);
}
public double avgDate(Holiday ... holiday ){
    int sum=0;
for (Holiday i:holiday){
    sum+=holiday[i].day;
}
return sum/holiday.length;
}
}
