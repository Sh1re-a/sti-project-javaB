package se.sti.model.student;

import se.sti.model.Person;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table(name = "Student")
public class Student extends Person {

    @Column
     private int course;
    @Column
     private final boolean haveComputer = true;




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
    public Student createStudent(Object Student) {
        return null;
    }
}
