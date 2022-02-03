package service.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import se.sti.models.course.Course;
import se.sti.models.teacher.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherServiceTest {

    @Test
    public void shouldGetTeacherSalary() {
        Teacher teacher = new Teacher(1, "19971206", "Shirwac", "Abib", 1L, 189);
        int teacherSalary = teacher.getHourlyRate();
        Long course = teacher.getCourseCode();
        Course Course = new Course(1, "1889", "Java", "90", 60);
        int totalHours = Course.getTotalHours();
        int monthlySalary = teacherSalary * totalHours;
    }

    @Test
    public void shouldUpdateTeacher() {
        Teacher teacher = new Teacher();
        teacher.setFirstName("Shirwac");
        teacher.setLastName("Abib");
        teacher.setHourlyRate(190);
        teacher.setCourseCode(3L);
        teacher.setPersonNumber("19971206");
    }
    @Test
    public void shouldGetAverageSalary() {

        int averageSalary = 0;
        Teacher teacher = new Teacher(1, "19971206", "Shirwac", "Abib", 1L, 189);
        Teacher teacher1 = new Teacher(2, "19971206", "Shirwac", "Abib", 1L, 200);
        List<Teacher> id = new ArrayList<>();
        id.add(teacher);
        id.add(teacher1);

        for (int i = 0; i < id.size(); i++) {

            long courseCode = id.get(i).getCourseCode();
            int teacherSalary = id.get(i).getHourlyRate();
            Course course = new Course(1, "1889", "Java", "90", 60);
            int totalHours = course.getTotalHours();
            averageSalary = averageSalary + (teacherSalary * totalHours);
        }
        averageSalary = averageSalary / id.size();

        Integer x = averageSalary;
        String averageSalaryString = x.toString();

    }

}
