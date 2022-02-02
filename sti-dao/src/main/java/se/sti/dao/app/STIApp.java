package se.sti.dao.app;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import se.sti.models.course.Course;
import se.sti.models.teacher.Teacher;
import se.sti.service.teacher.TeacherService;

@SpringBootApplication(scanBasePackages = {"se.sti.*"})
@ComponentScan(basePackages = {"se.sti.*"})
@EntityScan(basePackages = {"se.sti.*"})
@EnableJpaRepositories(basePackages = {"se.sti.*"})

public class STIApp {
    public static void main(String[] args) {
        SpringApplication.run(STIApp.class);



    }
}





