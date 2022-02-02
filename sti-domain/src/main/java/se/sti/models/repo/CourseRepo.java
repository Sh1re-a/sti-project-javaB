package se.sti.models.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import se.sti.models.course.Course;

import java.util.List;

public interface CourseRepo extends JpaRepository <Course, String> {
   Course findByCourseCode(String courseCode);
}
