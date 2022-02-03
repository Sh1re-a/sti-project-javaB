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
    private Long courseCode;

    public Student() {
    }

    public Student(long id, String personNumber, String firstName, String lastName, Long courseCode) {
        this.id = id;
        this.personNumber = personNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.courseCode = courseCode;
    }

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

    public Long getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(Long courseCode) {
        this.courseCode = courseCode;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", personNumber='" + personNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", courseCode=" + courseCode +
                '}';
    }
}

