package se.sti.models.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import se.sti.models.course.Course;

public interface CourseRepo extends JpaRepository <Course, String> {
    Course findByCourseCode(String courseCode);
}
