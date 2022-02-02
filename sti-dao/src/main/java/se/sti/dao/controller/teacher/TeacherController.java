package se.sti.dao.controller.teacher;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import se.sti.models.repo.TeacherRepo;
import se.sti.models.teacher.Teacher;
import se.sti.service.teacher.TeacherService;

import java.util.List;

@RestController
public class TeacherController {


    @Autowired
    private TeacherRepo teacherRepo;

    @GetMapping(value ="/teacher/getAll")
    public List<Teacher> getTeachers(){
        return teacherRepo.findAll();
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




}
