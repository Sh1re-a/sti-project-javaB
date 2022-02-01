package se.sti.models.course;

import se.sti.models.teacher.Teacher;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {
    @Id
    private String courseCode;
    @Column
    private String courseName;
    @Column
    private String yhPoints;
    @Column
    private int totalHours;
    @Column
    private Teacher teacher;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getYhPoints() {
        return yhPoints;
    }

    public void setYhPoints(String yhPoints) {
        this.yhPoints = yhPoints;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public int getTotalHours() {
        return totalHours;
    }

    public void setTotalHours(int totalHours) {
        this.totalHours = totalHours;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
