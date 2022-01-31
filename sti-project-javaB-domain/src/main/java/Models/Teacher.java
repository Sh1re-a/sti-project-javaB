package Models;

import java.util.List;

public class Teacher extends Person{

    private List<Course> courses;
    private int hourlyRate;

    public Teacher(List<Course> courses, int hourlyRate) {
        this.courses = courses;
        this.hourlyRate = hourlyRate;
    }

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
