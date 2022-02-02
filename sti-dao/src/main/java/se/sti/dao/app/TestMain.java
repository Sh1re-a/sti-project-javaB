package se.sti.dao.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import se.sti.dao.controller.teacher.TeacherController;
import se.sti.models.course.Course;
import se.sti.models.repo.CourseRepo;
import se.sti.models.repo.TeacherRepo;
import se.sti.models.teacher.Teacher;

public class TestMain {



    public static void main(String[] args) {
        TeacherController  x = new TeacherController();
        Teacher y = new Teacher("199712062315", "Shirwac", "Abib","1881",150);

       int monthly = x.teacherSalary(y);
       System.out.println(monthly);





        }
    }


