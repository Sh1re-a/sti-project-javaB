package se.sti.models.student;



import javax.persistence.*;

@Entity @Table(name = "Student")
public class Student  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String personNumber;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private int course;
    @Column
    private final boolean haveComputer = true;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

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

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", personNumber='" + personNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", course=" + course +
                ", haveComputer=" + haveComputer +
                '}';
    }
}

