package Models;

import javax.persistence.*;

@Entity
public class Student extends Person{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id = getId();
    @Column
    private String fName = getfName();
    @Column
    private String lName = getlName();
    @Column
    private String personNumber = getPersonNumber();
    @Column
    private int course;
    @Column
    private final boolean haveComputer = true;


    public Student(int course) {
        this.course = course;
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
