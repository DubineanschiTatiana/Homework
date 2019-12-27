public class Date {
int month;
int day;
int year;
Date(int month, int day, int year){
this.month=month;
this.day=day;
this.year=year;
}
void displayDate(){
    System.out.println(this.month+"/"+this.day+"/"+this.year);
}
}
