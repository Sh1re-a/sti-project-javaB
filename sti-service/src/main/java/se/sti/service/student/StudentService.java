package se.sti.service.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import se.sti.models.repo.StudentRepo;
import se.sti.models.student.Student;


import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;

    public Student findByPersonNumber(String personNumber){
        Student obj = studentRepo.findByPersonNumber(personNumber);
        return obj;
    }


    public String hej() {
        return "HEJ";
    }



    public List<Student> getUsers(){
        return studentRepo.findAll();
    }


    public Student saveStudent(Student student){
        return student;
    }

    public Student updateStudent(String personNumber, Student student){
        Student updateStudent = studentRepo.findByPersonNumber(personNumber);
        updateStudent.setFirstName(student.getFirstName());
        updateStudent.setLastName(student.getLastName());
        updateStudent.setCourse(student.getCourse());
       return updateStudent;

    }



}
