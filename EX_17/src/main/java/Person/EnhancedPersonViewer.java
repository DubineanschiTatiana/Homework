package Person;

public class EnhancedPersonViewer extends PersonViewer {

    public void view(Person person) {
        if (person instanceof Student) {
            System.out.println("Student:");
            System.out.println("Name: " + person.getName());
            System.out.println("Email: " + person.getEmail());
            System.out.println("Grade: "
                    + ((Student) person).getGrade());
            System.out.println("\n");
        } else if (person instanceof Lecturer) {
            System.out.println("Lecturer:");
            System.out.println("Name: " + person.getName());
            System.out.println("Email: " + person.getEmail());
            System.out.println("Subject: "
                    + ((Lecturer) person).getSubject());
            System.out.println("\n");
        } else {
            System.out.println("Employee:");
            System.out.println("Name: " + person.getName());
            System.out.println("Email: " + person.getEmail());
            System.out.println("Department: "
                    + ((Employee)person).getDepartment());
            System.out.println("\n");
        }

    }

    public void viewPerson(Student student) {
        System.out.println("Student:");
        System.out.println("Name: " + student.getName());
        System.out.println("Email: " + student.getEmail());
        System.out.println("Grade: "
                + student.getGrade());
        System.out.println("\n");
    }

    public void viewPerson(Lecturer lecturer) {
        System.out.println("Lecturer:");
        System.out.println("Name: " + lecturer.getName());
        System.out.println("Email: " + lecturer.getEmail());
        System.out.println("Subject: "
                + lecturer.getSubject());
        System.out.println("\n");
    }

    public void viewPerson(Employee employee) {
        System.out.println("Employee:");
        System.out.println("Name: " + employee.getName());
        System.out.println("Email: " + employee.getEmail());
        System.out.println("Department: "
                + employee.getDepartment());
        System.out.println("\n");
    }
}
