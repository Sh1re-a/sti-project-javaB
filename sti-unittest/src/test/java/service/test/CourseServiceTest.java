package service.test;

import org.junit.jupiter.api.Test;
import se.sti.models.course.Course;

public class CourseServiceTest {

    @Test
    public void shouldUpdateCourse(){
        Course course = new Course();
        course.setCourseName("Java");
        course.setTotalHours(90);
        course.setYhPoints("40");
        course.setCourseCode("1881");

    }

}
