package se.sti.models.teacher;

import se.sti.models.Person;
import se.sti.models.course.Course;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.List;


@Entity
public class Teacher extends Person {

    @Column
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
