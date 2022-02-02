package se.sti.models.teacher;




import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Teacher {

    @Id
    private String personNumber;
    @Column
    private String firstName;
    @Column
    private String lastName;

    //Tydligen så stöder inte MySQL arrays ://
    //Kunde inte få det funka med att hämta fler Kurser när jag skulle räkna
    //lönerna, så varje lärare får en kurs.
    @Column
    private String courses;

    @Column
    private int hourlyRate;

    public Teacher(String personNumber, String firstName, String lastName, String courses, int hourlyRate) {
        this.personNumber = personNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.courses = courses;
        this.hourlyRate = hourlyRate;
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


    public String getCourses() {
        return courses;
    }

    public void setCourses(String courses) {
        this.courses = courses;
    }



    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}
