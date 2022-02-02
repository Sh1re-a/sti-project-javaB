package se.sti.dao.controller.teacher;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.thymeleaf.engine.TemplateHandlerAdapterMarkupHandler;
import se.sti.dao.controller.course.CourseController;
import se.sti.models.course.Course;
import se.sti.models.repo.CourseRepo;
import se.sti.models.repo.TeacherRepo;
import se.sti.models.teacher.Teacher;
import se.sti.service.teacher.TeacherService;

import java.util.List;

@RestController
public class TeacherController {


    @Autowired
    private TeacherRepo teacherRepo;

    @Autowired
    private CourseRepo courseRepo;

    @GetMapping(value ="/teacher/getAll")
    public List<Teacher> getTeachers(){
        return teacherRepo.findAll();
    }

    @GetMapping(value ="/teacher/get")
    public List <Teacher>getTeacher(@RequestBody String personNumber){
        Teacher teacher = teacherRepo.findByPersonNumber(personNumber);
        return teacherRepo.findByPersonNumber()
    }

    @PostMapping(value ="/teacher/save")
    public String saveTeacher(@RequestBody Teacher teacher){
        teacherRepo.save(teacher);
        return"The teacher is saved...";
    }

     @PutMapping(value = "/teacher/update/{personNumber}")
    public String updateTeacher(@PathVariable String personNumber, @RequestBody Teacher teacher){
         TeacherService x = new TeacherService();
         Teacher updateTeacher = x.updateTeacher(personNumber, teacher);
         teacherRepo.save(teacher);
         return "The teacher is updated...";
     }

     @DeleteMapping(value = "/teacher/delete/{personNumber}")
     public String deleteTeacher(@PathVariable String personNumber){
        TeacherService x = new TeacherService();
        Teacher deleteTeacher = x.deleteStudent(personNumber);
        teacherRepo.delete(deleteTeacher);
        return "The teacher is deleted...";
     }
     @PostMapping(value ="/teacher/getSalary")
     public int teacherSalary(@RequestBody Teacher teacher){
        teacher = teacherRepo.findByPersonNumber(teacher.getPersonNumber());
        teacherRepo.save(teacher);
         int teacherSalary = teacher.getHourlyRate();
         String course = teacher.getCourses();
         Course Course = courseRepo.findByCourseCode(course);
         int totalHours = Course.getTotalHours();

         int monthlySalary = teacherSalary  * totalHours;
         return monthlySalary;
     }

    @GetMapping(value ="/teacher/getSalary/199712062315")
    public int teacherSalary1(@PathVariable String personNumber){
        Teacher teacher = teacherRepo.findByPersonNumber(personNumber);
        int teacherSalary = teacher.getHourlyRate();
        String course = teacher.getCourses();
        Course Course = courseRepo.findByCourseCode(course);
        int totalHours = Course.getTotalHours();

        int monthlySalary = teacherSalary  * totalHours;
        return monthlySalary;
    }





     }





