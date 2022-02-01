package se.sti.models.student;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table(name = "Student")
public class Student  {

    @Id
    private String personNumber;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private int course;
    @Column
    private final boolean haveComputer = true;


    public String getPersonNumber() {
        return personNumber;
    }

    public void setPersonNumber(String personNumber) {
        this.personNumber = personNumber;
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

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public boolean isHaveComputer() {
        return haveComputer;
    }
}
