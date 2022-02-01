package se.sti.stiprojectjavaB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.persistence.Entity;

@SpringBootApplication
@ComponentScan(basePackages = {"se.sti.*"})
@EntityScan(basePackages = {"se.sti.*"})
@EnableJpaRepositories(basePackages = {"se.sti.*"})

public class StiProjectJavaBApplication {

	public static void main(String[] args) {
		SpringApplication.run(StiProjectJavaBApplication.class, args);
	}

}
