package se.sti.dao.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import se.sti.models.repo.StudentRepo;

@RestController
public class ApiControllers {

    @Autowired
    private StudentRepo studentRepo;

    @GetMapping(value = "/")
    public String getPage(){
        return "Welcome";
    }

}
