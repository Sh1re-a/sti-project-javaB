package se.sti.models.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import se.sti.models.teacher.Teacher;

public interface TeacherRepo extends JpaRepository<Teacher, Long> {

    Teacher findByPersonNumber(String personNumber);
}
