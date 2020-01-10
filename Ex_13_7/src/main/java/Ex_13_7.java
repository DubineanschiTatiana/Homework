
import java.util.ArrayList;
import java.util.Arrays;

public class Ex_13_7 {

    public static void main(String... args) {
        Employee e1 = new Employee(1, "Burlacu", 7500);
        Employee e2 = new Employee(2, "Snegur", 10000);
        Employee e3 = new Employee(3, "Cojocari", 15000);
        ArrayList<Employee> list = new ArrayList<>();
        list.addAll(Arrays.asList(e1,e2,e3));
        search(list,1);
        
    }
public static void search(ArrayList<Employee> list, int id){
for(Employee employee : list) { 
   if(employee.getId()==(id)) { 
       System.out.println("Found: ");
       System.out.println(employee.toString());
   }
}
}
}
