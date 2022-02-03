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

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

     @RequestMapping( value ="/teacher/getSalary/{id}",method=RequestMethod.POST)
     public String teacherSalary(@PathVariable long id){
        Teacher teacher = teacherRepo.findById(id).orElseThrow(null);
        long courseCode = teacher.getCourseCode();
        int teacherSalary = teacher.getHourlyRate();

         Course Course = courseRepo.findById(courseCode).orElseThrow();
         int totalHours = Course.getTotalHours();

         int monthlySalary = teacherSalary * totalHours;

         Integer x = monthlySalary;
        String monthlySalaryString = x.toString();

         return monthlySalaryString + " Kr i månaden";
     }




    @RequestMapping( value ="/teacher/getAverageSalary/multiple-id",method=RequestMethod.POST)
        public String AverageTeacherSalary(@RequestBody List<Long> id){

        int averageSalary= 0;

        for(int i = 0; i < id.size(); i++) {
            Teacher teacher = teacherRepo.findById(id.get(i)).orElseThrow(null);
            long courseCode = teacher.getCourseCode();
            int teacherSalary = teacher.getHourlyRate();
            Course Course = courseRepo.findById(courseCode).orElseThrow();
            int totalHours = Course.getTotalHours();
            averageSalary = averageSalary + (teacherSalary * totalHours);
        }
        averageSalary= averageSalary / id.size();

        Integer x = averageSalary;
        String averageSalaryString = x.toString();

        return averageSalaryString + " Kr i månaden är den genomsnittliga lönen mellan de angivna personerna";
    }








     }





