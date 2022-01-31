package Models;

public class Course extends Person{
    private int courseName;
    private int coursePoints;
    private int courseCode;
    private int totalHours;
    private Person teacher;

    public Course(int courseName, int coursePoints, int courseCode, int totalHours, Person teacher) {
        this.coursePoints = coursePoints;
        this.courseCode = courseCode;
        this.totalHours = totalHours;
        this.teacher = teacher;
    }

    public int getCourseName() {
        return courseName;
    }

    public void setCourseName(int courseName) {
        this.courseName = courseName;
    }

    public int getCoursePoints() {
        return coursePoints;
    }

    public void setCoursePoints(int coursePoints) {
        this.coursePoints = coursePoints;
    }

    public int getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(int courseCode) {
        this.courseCode = courseCode;
    }

    public int getTotalHours() {
        return totalHours;
    }

    public void setTotalHours(int totalHours) {
        this.totalHours = totalHours;
    }

    public Person getTeacher() {
        return teacher;
    }

    public void setTeacher(Person teacher) {
        this.teacher = teacher;
    }
}
