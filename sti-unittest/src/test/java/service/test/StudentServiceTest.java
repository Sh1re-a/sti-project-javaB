package service.test;


import org.junit.jupiter.api.Test;

import se.sti.models.student.Student;


public class StudentServiceTest {



    @Test
    public void shouldUpdateStudent(){
        Student student = new Student();
        student.setFirstName("Shirwac");
        student.setLastName("Abib");
        student.setCourseCode(3L);
        student.setPersonNumber("199712062315");
    }




}
