package se.sti.models.teacher;




import se.sti.models.repo.TeacherRepo;

import javax.persistence.*;


@Entity
public class Teacher {

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
    private long courseCode;
    @Column
    private int hourlyRate;

    public Teacher() {
    }

    public Teacher(long id, String personNumber, String firstName, String lastName, long courseCode, int hourlyRate) {
        this.id = id;
        this.personNumber = personNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.courseCode = courseCode;
        this.hourlyRate = hourlyRate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "personNumber='" + personNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", courses='" + courseCode + '\'' +
                ", hourlyRate=" + hourlyRate +
                '}';
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

    //TODO: JPA kan inte läsa av dessa,det är för att de läs in som objekt


    public long getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(long courseCode) {
        this.courseCode = courseCode;
    }



    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}
