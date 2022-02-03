package se.sti.dao.controller.student;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;
import se.sti.models.repo.StudentRepo;
import se.sti.models.student.Student;
import se.sti.service.student.StudentService;

import java.util.List;


@RestController
public class StudentController {

    @Autowired
    private StudentRepo studentRepo;



    @GetMapping(value = "/1")
    public String getPage(){
        return "Welcome";
    }

    @GetMapping(value ="/student/getAll")
    public List<Student> getStudents() {
        return studentRepo.findAll();
    }

    @GetMapping(value ="/student/get/{id}")
    public String getStudent(@PathVariable long id){
        Student student = studentRepo.findById(id).orElseThrow(null);
        return student.toString();
    }


    @PostMapping(value = "/student/save")
    public String saveStudent(@RequestBody Student student){
        studentRepo.save(student);
        return "Student is saved...";
    }
    @PutMapping(value = "/student/update/{personNumber}")
    public String updateStudent(@PathVariable long id, @RequestBody Student student){
        StudentService x = new StudentService();
        Student updateStudent = x.updateStudent(id, student);
        studentRepo.save(updateStudent);
        return "Student is updated...";
    }
    @DeleteMapping(value = "/student/delete/{personNumber}")
    public String deleteStudent(@PathVariable long id){
        StudentService x = new StudentService();
        Student deleteStudent = x.deleteStudent(id);
        studentRepo.delete(deleteStudent);
        return "Student is deleted...";
    }



}
