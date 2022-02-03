package se.sti.dao.app;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import se.sti.models.course.Course;
import se.sti.models.teacher.Teacher;
import se.sti.service.teacher.TeacherService;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication(scanBasePackages = {"se.sti.*"})
@ComponentScan(basePackages = {"se.sti.*"})
@EntityScan(basePackages = {"se.sti.*"})
@EnableJpaRepositories(basePackages = {"se.sti.*"})
@EnableSwagger2
public class STIApp {
    public static void main(String[] args) {
        SpringApplication.run(STIApp.class);

    }
        @Bean
        public Docket swaggerConfiguration(){

            return new Docket(DocumentationType.SWAGGER_2)
                    .select()
                    .apis(RequestHandlerSelectors.basePackage("se.sti.dao.controller"))
                    .build();

        }




    }






