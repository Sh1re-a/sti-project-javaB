package se.sti.dao.controller.student;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import se.sti.models.repo.StudentRepo;
import se.sti.models.student.Student;
import se.sti.service.student.StudentService;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentRepo studentRepo;

    @GetMapping(value = "/")
    public String getPage(){
        return "Welcome";
    }

    @GetMapping(value ="/student/getAll")
    public List<Student> getStudents() {
        return studentRepo.findAll();
    }


    @PostMapping(value = "/student/save")
    public String saveStudent(@RequestBody Student student){
        studentRepo.save(student);
        return "Student is saved...";
    }
    @PutMapping(value = "/student/update/{personNumber}")
    public String updateStudent(@PathVariable String personNumber, @RequestBody Student student){
        StudentService x = new StudentService();
        Student updateStudent = x.updateStudent(personNumber, student);
        studentRepo.save(updateStudent);
        return "Student is updated...";
    }
    @DeleteMapping(value = "/student/delete/{personNumber}")
    public String deleteStudent(@PathVariable String personNumber){
        StudentService x = new StudentService();
        Student deleteStudent = x.deleteStudent(personNumber);
        studentRepo.delete(deleteStudent);
        return "Student is deleted...";
    }



}
