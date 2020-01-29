package Person;

public class PersonViewerTest {
    public static void main(String[] args) {
        Student student=new Student("email@email.com","Melnic Nicolae","B");
        Lecturer lecturer=new Lecturer("email1@email.com","Gavrilita Victoria","Math");
        Employee employee=new Employee("email2@gmail.com","Cucos Nadejda","HR");
        PersonViewer p=new PersonViewer();
        /*
        p.view(student);
        p.view(lecturer);
        p.view(employee);
        */
        EnhancedPersonViewer e=new EnhancedPersonViewer();
        e.view(student);
        e.viewPerson(employee);
    }
  
}
