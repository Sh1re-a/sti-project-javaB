package se.sti.dao.controller.teacher;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import org.thymeleaf.engine.TemplateHandlerAdapterMarkupHandler;
import se.sti.dao.controller.course.CourseController;
import se.sti.models.course.Course;
import se.sti.models.repo.CourseRepo;
import se.sti.models.repo.TeacherRepo;
import se.sti.models.teacher.Teacher;
import se.sti.service.teacher.TeacherService;

import java.util.List;
import java.util.Optional;

@RestController
public class TeacherController {


    @Autowired
    private TeacherRepo teacherRepo;
    private CourseRepo courseRepo;

    @GetMapping(value ="/teacher/getAll")
    public List<Teacher> getTeachers(){
        return teacherRepo.findAll();
    }

   @GetMapping(value ="/teacher/get/{id}")
    public String  getTeacher(@PathVariable long id){

        Teacher teacher   = teacherRepo.findById(id).orElseThrow(null);
       return teacher.toString();


    }



    @PostMapping(value ="/teacher/save")
    public String saveTeacher(@RequestBody Teacher teacher){
        teacherRepo.save(teacher);
        return"The teacher is saved...";
    }

    @PutMapping(value = "/teacher/update/{personNumber}")
    public String updateTeacher(@PathVariable long id, @RequestBody Teacher teacher){
         TeacherService x = new TeacherService();
         Teacher updateTeacher = x.updateTeacher(id, teacher);
         teacherRepo.save(teacher);
         return "The teacher is updated...";
     }

     @DeleteMapping(value = "/teacher/delete/{personNumber}")
     public String deleteTeacher(@PathVariable long id){
        TeacherService x = new TeacherService();
        Teacher deleteTeacher = x.deleteStudent(id);
        teacherRepo.delete(deleteTeacher);
        return "The teacher is deleted...";
     }
     @PostMapping(value ="/teacher/getSalary/1")
     @ResponseBody
     public int teacherSalary(@PathVariable long id){
        Teacher teacher = teacherRepo.findById(id).orElseThrow(null);
       String courseCode = teacher.getCourseCode();

        int teacherSalary = teacher.getHourlyRate();
         String course = teacher.getCourseCode();
         Course Course = courseRepo.findByCourseCode(course);
         int totalHours = Course.getTotalHours();

         int monthlySalary = teacherSalary * totalHours;
         return monthlySalary;
     }

    @GetMapping(value ="/teacher/getSalary/{id}")
    public int teacherSalary1(@PathVariable long id){
       Teacher teacher = teacherRepo.findById(id).orElseThrow(null);


        int teacherSalary = teacher.getHourlyRate();
        String course = teacher.getCourseCode();
        Course Course = courseRepo.findByCourseCode(course);
        int totalHours = Course.getTotalHours();

        int monthlySalary = teacherSalary  * totalHours;
        return monthlySalary;
    }





     }





