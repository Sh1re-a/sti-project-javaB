package se.sti.model;

import se.sti.model.student.Student;

import javax.persistence.*;

@MappedSuperclass
public abstract class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ManyToOne @JoinColumn(name="id")
    protected long id;
    @ManyToOne @JoinColumn(name="firstName")
    protected String firstName;
    @ManyToOne @JoinColumn(name="lastName")
    protected String lastName;
    @ManyToOne @JoinColumn(name="personNumber")
    protected String personNumber;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPersonNumber() {
        return personNumber;
    }

    public void setPersonNumber(String personNumber) {
        this.personNumber = personNumber;
    }




}
