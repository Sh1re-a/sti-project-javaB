package Models;

import javax.persistence.Entity;
import javax.persistence.Id;


public class Student extends Person{



    private int course;
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
