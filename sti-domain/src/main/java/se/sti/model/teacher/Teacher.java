package se.sti.model.teacher;

import se.sti.model.Person;
import se.sti.model.course.Course;
import se.sti.model.student.Student;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.List;


@Entity
public class Teacher extends Person {


    private List<Course>courses;
    @Column
    private int hourlyRate;




    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }


}
