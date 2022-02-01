package se.sti.models.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import se.sti.models.student.Student;

public interface StudentRepo extends JpaRepository<Student, Long> {
}
