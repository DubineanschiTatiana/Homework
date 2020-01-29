/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Person;

/**
 *
 * @author Slava
 */
public class Lecturer implements Person {

    private String email;
    private String name;
    private String subject;

    public Lecturer(String email, String name, String subject) {
        this.email = email;
        this.name = name;
        this.subject = subject;
    }

    @Override
    public String getEmail() {
        return this.email;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public String getSubject() {
        return this.name;
    }

    @Override
    public String getDescription() {
    return "Teaches "+ getSubject();}

}
