public class Staff extends Person {
private String school;
private double pay;

    public Staff(String school, double pay, String name, String adress) {
        super(name, adress);
        this.school = school;
        this.pay = pay;
    }

    public String getSchool() {
        return school;
    }

    public double getPay() {
        return pay;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }
    
@Override
    public String toString() {
    return "Staff[Person[name="+getName()+",adress="+getAdress()+"],school="+this.school+",pay="+this.pay;
    }

}
